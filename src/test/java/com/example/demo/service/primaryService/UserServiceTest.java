package com.example.demo.service.primaryService;

import com.example.demo.domain.primaryDomain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * sun on 2017/6/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUser() throws Exception {
        User user = userService.addUser(new User("N01",12));
        Assert.assertEquals(Integer.valueOf(12),user.getAge());
        Assert.assertEquals("N01",user.getName());
    }

    @Test
    public void findUserById() throws Exception {

    }

    @Test
    public void deleteUserById() throws Exception {

    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {

    }



}