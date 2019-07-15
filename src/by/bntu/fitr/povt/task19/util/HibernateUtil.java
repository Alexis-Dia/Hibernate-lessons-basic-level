package by.bntu.fitr.povt.task19.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    public static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            //new Configuration().configure("/resources/hibernate.cfg.xml");
            return new Configuration().configure("/task18/hibernate.cfg.xml").buildSessionFactory();
        } catch (HibernateException ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
           // throw new HibernateException(ex);
        }
        return null;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

    public static Session getSession() {
        if (sessionFactory != null) {
            Session session = sessionFactory.openSession();
            return session;
        }
        return null;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}
