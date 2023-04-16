package JAVA_OOP.Seminar05.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();

    String CreateUser(User user);

    void UpdateUser(User user);
}