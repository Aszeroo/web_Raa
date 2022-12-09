package com.webraa.demo.services.impl;

import com.webraa.demo.entities.User;
import com.webraa.demo.repositories.UserRepository;
import com.webraa.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<User> findUsername(String userName) {
        return userRepository.findByUsername(userName);
    }

    @Override
    public User save(User user) {
        user.setCreateDate(new Date());
        user.setCreateBy("System");
        user.setUpdateDate(new Date());
        user.setUpdateBy("System");
        user.setType("user");

        return userRepository.save(user);
    }
}
