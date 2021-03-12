package com.itstep.restApi.controller;

import com.itstep.restApi.entity.Role;
import com.itstep.restApi.entity.UserM;
import com.itstep.restApi.service.RoleService;
import com.itstep.restApi.service.UserService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api")
public class Controller {

    @Autowired
    private UserService service;

    @Autowired
    private RoleService roleService;

    @GetMapping("user/{id}")
    public UserM getUserById(@PathVariable Long id) {
        return service.getUser(id);
    }

    @GetMapping("role/{id}")
    public Role getRoleById(@PathVariable Long id) {
        return roleService.getRole(id);
    }

    @GetMapping("/getAllUser")
    public List<UserM> getAllUser() {
        return service.getAllUsers();
    }

    @GetMapping("/getAllRole")
    public List<Role> getAllRole() {
        return roleService.getAllRoles();
    }

    @PutMapping("/addUser")
    public void SaveNewUser(@PathVariable UserM user) {
        service.saveNewUser(user);
    }

    @PutMapping("/addRole")
    public void SaveNewRole(@PathVariable Role role) {
        roleService.saveNewRole(role);
    }

    @DeleteMapping("user/{id}")
    @SneakyThrows
    public void deleteUser(@PathVariable Long id) {
        service.deleteUserByid(id);
    }

    @DeleteMapping("role/{id}")
    @SneakyThrows
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRoleByid(id);
    }
}
