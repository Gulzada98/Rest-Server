package com.itstep.restApi.service;

import com.itstep.restApi.entity.Role;

import java.util.List;

public interface RoleService {

    Role getRole(Long id);

    List<Role> getAllRoles();

    void saveNewRole(Role role);

    void deleteRoleByid(Long id);
}
