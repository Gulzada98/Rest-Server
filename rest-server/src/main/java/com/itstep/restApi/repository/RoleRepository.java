package com.itstep.restApi.repository;

import com.itstep.restApi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    //Collection<Role> findAllById(Long id);
    Role findAllById(Long id);
}
