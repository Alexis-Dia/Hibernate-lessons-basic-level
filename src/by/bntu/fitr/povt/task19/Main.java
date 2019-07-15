package by.bntu.fitr.povt.task19;

import by.bntu.fitr.povt.task19.dao.DAOMaker;
import by.bntu.fitr.povt.task19.dao.IDAOFactory;
import by.bntu.fitr.povt.task19.dao.idao.IDAOUser;
import by.bntu.fitr.povt.task19.pojos.Employee;

public class Main {

    public static void main(String[] args) {

        IDAOFactory factory = new DAOMaker();
        IDAOUser<Employee> daoUser = factory.getDAOUser();
        daoUser.delete(36);

    }
}
