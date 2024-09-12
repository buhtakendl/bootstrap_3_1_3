package com.spring.bootstrap.newProject.DAO;

import com.spring.bootstrap.newProject.model.Role;

import java.util.List;

public interface RoleDAO {

    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
