package com.itstep.restApi.service;

import com.itstep.restApi.entity.Role;
import com.itstep.restApi.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role getRole(Long id) {

        //return roleRepository.getOne(id);
        return roleRepository.findAllById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public void saveNewRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteRoleByid(Long id) {
        roleRepository.deleteById(id);
    }
}
