package vigen_hovhannisyan.removeUsersFromArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user = new User("Vigen","Hovhannisyan",18);
        User user2 = new User("Vigen","Hovhannisyan",18);
        User user3 = new User("Vazgen","Hovhannisyan",21);
        userList.add(user);
        userList.add(user2);
        userList.add(user3);

        }
    }

