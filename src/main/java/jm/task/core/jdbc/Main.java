package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserService user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Name1", "LastName1", (byte) 20);
        System.out.println(user.toString());
        user.saveUser("Name2", "LastName2", (byte) 25);
        System.out.println(user);
        user.saveUser("Name3", "LastName3", (byte) 31);
        System.out.println(user);
        user.saveUser("Name4", "LastName4", (byte) 38);
        System.out.println(user);

        user.removeUserById(1);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
