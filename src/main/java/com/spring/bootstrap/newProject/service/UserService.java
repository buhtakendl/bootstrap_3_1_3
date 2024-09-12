package com.spring.bootstrap.newProject.service;

import com.spring.bootstrap.newProject.model.User;

import java.util.List;

public interface UserService {
        void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserById(long id);
}
