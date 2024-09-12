package com.spring.bootstrap.newProject.service;

import com.spring.bootstrap.newProject.DAO.RoleDAO;
import com.spring.bootstrap.newProject.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    private final RoleDAO roleDAO;

    @Autowired
    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    @Transactional
    public List<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

    @Override
    @Transactional
    public Role getRole(String role) {
        return roleDAO.getRole(role);
    }

    @Override
    @Transactional
    public Role getRoleById(Long id) {
        return roleDAO.getRoleById(id);
    }

    @Transactional
    @Override
    public void addRole(Role role) {
        roleDAO.addRole(role);
    }
}
