package com.webraa.demo.services;

import com.webraa.demo.entities.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findUsername(String userName);

    User save(User user);

}
