package by.bntu.fitr.povt.task19;

import by.bntu.fitr.povt.task19.pojos.*;
import by.bntu.fitr.povt.task19.util.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSession();

        Transaction transaction = session.beginTransaction();
        session.save(new Employee("Alex4", "D1", 32));
        transaction.commit();
        session.close();
    }
}
