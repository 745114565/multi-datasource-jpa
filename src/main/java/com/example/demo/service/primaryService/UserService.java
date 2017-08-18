package com.example.demo.service.primaryService;

import com.example.demo.domain.primaryDomain.User;

/**
 * sun on 2017/6/22.
 */
public interface UserService {
    User addUser(User user);
    User findUserById(Long id);
    void deleteUserById(Long id);
    void deleteUser(User user);
    User updateUser(User user);
}
