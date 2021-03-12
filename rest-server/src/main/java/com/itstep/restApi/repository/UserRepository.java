package com.itstep.restApi.repository;

import com.itstep.restApi.entity.UserM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserM, Long> {
    //Collection<UserM> findAllById(Long id);

    UserM findAllById(Long id);
}

