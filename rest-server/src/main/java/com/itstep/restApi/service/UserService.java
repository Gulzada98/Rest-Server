package com.itstep.restApi.service;

import com.itstep.restApi.entity.UserM;

import java.util.List;

public interface UserService {

    UserM getUser(Long id);

    List<UserM> getAllUsers();

    void saveNewUser(UserM userM);

    void deleteUserByid(Long id);

}

