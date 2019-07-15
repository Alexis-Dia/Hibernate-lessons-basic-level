package by.bntu.fitr.povt.task19;

import by.bntu.fitr.povt.task19.dao.DAOMaker;
import by.bntu.fitr.povt.task19.dao.IDAOFactory;
import by.bntu.fitr.povt.task19.dao.idao.IDAOUser;
import by.bntu.fitr.povt.task19.pojos.Employee;
import org.hibernate.HibernateException;

public class Main {

    public static void main(String[] args) {

        IDAOFactory factory = new DAOMaker();
        IDAOUser<Employee> daoUser = factory.getDAOUser();
        //IDAOUser<Employee> daoUser = new UserDAO();

        try {
            daoUser.delete(1);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}
