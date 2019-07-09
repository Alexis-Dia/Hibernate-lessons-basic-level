package by.bntu.fitr.povt;

import by.bntu.fitr.povt.pojos.Employee;
import by.bntu.fitr.povt.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSession();

        Transaction transaction = session.beginTransaction();
        session.save(new Employee("Alex2", "D1", 32));
        transaction.commit();
        session.close();
    }
}
