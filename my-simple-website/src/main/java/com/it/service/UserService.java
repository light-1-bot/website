package com.it.service;

import com.it.mapper.UserMapper;
import com.it.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private  UserMapper userMapper;


    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    public void registerUser(User user) {
        userMapper.insertUser(user);
    }

    public User findUserByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    public User findUserByUsernameAndPassword(User user) {
        return userMapper.findUserByUsernameAndPassword(user);
    }
}
