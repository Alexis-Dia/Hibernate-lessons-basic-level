package by.bntu.fitr.povt.task19.dao.impl;

import by.bntu.fitr.povt.task19.dao.idao.IDAOUser;
import by.bntu.fitr.povt.task19.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey Druzik on 29.08.2016.
 */
public class UserDAO<T extends Serializable> implements IDAOUser<T> {

	private Class<T> persistentClass;
	private Session session;

	public UserDAO() {
/*		this.persistentClass = (Class<Employee>) ((ParameterizedType) getClass()
				.getGenericInterfaces()).getActualTypeArguments()[0];*/
	}

	@SuppressWarnings("unchecked")
	public void setSession(Session s) {
		this.session = s;
	}

	protected Session getSession() {
		if (session == null)
			throw new IllegalStateException("Session has not been set on DAO before usage");
		return session;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void delete(Integer id) throws HibernateException {
		Transaction transaction = null;
		try {
/*			Class<Employee> c = Employee.class;
			Type genericSuperclass = c.getGenericSuperclass();
			System.out.println(genericSuperclass);*/

			List<T> list = new ArrayList<>();


			this.persistentClass = (Class<T>) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];;

			Session session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			T t = (T) session.get(getPersistentClass(), id);
			session.delete(t);
			transaction.commit();
			session.close();
		} catch (HibernateException e) {
			System.out.println(e);
			transaction.rollback();
			throw new HibernateException("HibernateException = ", e);
		}

	}
}