package com.spring.bootstrap.newProject.DAO;

import com.spring.bootstrap.newProject.model.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByName(String login);

    User getUserById(long id);
}
