package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        new UserServiceImpl().createUsersTable();
        new UserServiceImpl().saveUser("Ivan", "Ivanov", (byte) 22);
        new UserServiceImpl().saveUser("ST", "Ivanov", (byte) 6);
        new UserServiceImpl().saveUser("VANYA", "Ivanov", (byte) 45);
        new UserServiceImpl().saveUser("SERGE", "Ivanov", (byte) 2);
        System.out.println(new UserServiceImpl().getAllUsers());
        new UserServiceImpl().cleanUsersTable();
        new UserServiceImpl().dropUsersTable();

    }
}
