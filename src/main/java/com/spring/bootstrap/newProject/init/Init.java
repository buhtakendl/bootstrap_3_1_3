package com.spring.bootstrap.newProject.init;

import com.spring.bootstrap.newProject.model.Role;
import com.spring.bootstrap.newProject.model.User;
import com.spring.bootstrap.newProject.service.RoleService;
import com.spring.bootstrap.newProject.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Init {
    private final UserService userService;
    private final RoleService roleService;

    public Init(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void init() {
        Role roleAdmin = new Role("ROLE_ADMIN");
        Role roleUser = new Role("ROLE_USER");
        Set<Role> adminSet = new HashSet<>();
        Set<Role> userSet = new HashSet<>();

        roleService.addRole(roleAdmin);
        roleService.addRole(roleUser);

        adminSet.add(roleAdmin);
        adminSet.add(roleUser);
        userSet.add(roleUser);

        User newUser = new User("Joe", "Black", 33, "Joe@mail.com",
                "user", userSet);
        User admin = new User("Natasha", "Rostova", 16, "Natasha@gmail.com",
                "admin", adminSet);

        userService.saveUser(newUser);
        userService.saveUser(admin);
    }
}
