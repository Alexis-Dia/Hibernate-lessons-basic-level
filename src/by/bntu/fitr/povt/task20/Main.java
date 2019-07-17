package by.bntu.fitr.povt.task20;

import by.bntu.fitr.povt.task20.dao.DAOMaker;
import by.bntu.fitr.povt.task20.dao.IDAOFactory;
import by.bntu.fitr.povt.task20.dao.idao.IDAOUser;
import by.bntu.fitr.povt.task20.pojos.Employee;
import org.hibernate.HibernateException;

public class Main {

    /**
     * https://habr.com/ru/post/271115/
     * @param args
     */
    public static void main(String[] args) {

        IDAOFactory factory = new DAOMaker();
        IDAOUser<Employee> daoUser = factory.getDAOUser();
        //IDAOUser<Employee> daoUser = new UserDAO();

        try {
            //daoUser.delete(39);
            //daoUser.save(new Employee("Alex", "D1", 32));
            //daoUser.saveOrUpdate(new Employee("Alex", "D1", 32));
            //daoUser.update(new Employee("Alex", "D1", 32));
            Employee employee = daoUser.find(32);
            System.out.println(employee);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}
