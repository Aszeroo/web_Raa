package com.webraa.demo.services;

import com.webraa.demo.entities.User;
import org.json.JSONObject;

import java.util.Optional;

public interface UserService {

    User save(User user);

    Object login(JSONObject reqVal);
}
