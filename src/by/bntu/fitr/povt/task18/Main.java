package by.bntu.fitr.povt.task18;

import by.bntu.fitr.povt.task18.pojos.*;
import by.bntu.fitr.povt.task18.util.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSession();

        Transaction transaction = session.beginTransaction();
        session.save(new Employee("Alex3", "D1", 32));
        transaction.commit();
        session.close();
    }
}
