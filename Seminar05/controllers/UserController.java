package JAVA_OOP.Seminar05.controllers;

import JAVA_OOP.Seminar05.model.Repository;
import JAVA_OOP.Seminar05.model.User;

import java.util.List;

public class UserController {
    private final Validation valid = new Validation();
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        valid.validate(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("User not found");
    }

    public List<User> allUsers() {
        return repository.getAllUsers();
    }

    public void updateUser(User user) {
        valid.validate(user);
        repository.UpdateUser(user);
    }
}