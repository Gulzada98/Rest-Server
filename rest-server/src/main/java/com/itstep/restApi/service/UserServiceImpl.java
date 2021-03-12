package com.itstep.restApi.service;

import com.itstep.restApi.entity.UserM;
import com.itstep.restApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserM getUser(Long id) {

        //return userRepository.getOne(id);
        return userRepository.findAllById(id);
    }

    @Override
    public List<UserM> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveNewUser(UserM userM) {
        userRepository.save(userM);
    }

    @Override
    public void deleteUserByid(Long id) {
        userRepository.deleteById(id);
    }
}
