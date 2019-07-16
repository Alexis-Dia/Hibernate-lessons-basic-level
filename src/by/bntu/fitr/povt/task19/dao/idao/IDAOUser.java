package by.bntu.fitr.povt.task19.dao.idao;

import org.hibernate.HibernateException;

/**
 * Created by Alexey Druzik on 29.08.2016.
 */
public interface IDAOUser<T> {

	void delete(Integer id) throws HibernateException;

	T saveOrUpdate (T t) throws HibernateException;

	T save (T t) throws HibernateException;

	T update (T t) throws HibernateException;

	T find (Integer id) throws HibernateException;
}
