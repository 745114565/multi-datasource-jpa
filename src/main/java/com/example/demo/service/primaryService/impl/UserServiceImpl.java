package com.example.demo.service.primaryService.impl;

import com.example.demo.domain.primaryDomain.User;
import com.example.demo.repository.primaryRepository.UserRepository;
import com.example.demo.service.primaryService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * sun on 2017/6/22.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void deleteUserById(Long id) {
         userRepository.delete(id);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
