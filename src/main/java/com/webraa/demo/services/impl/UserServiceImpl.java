package com.webraa.demo.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webraa.demo.entities.User;
import com.webraa.demo.repositories.UserRepository;
import com.webraa.demo.services.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        user.setCreateDate(new Date());
        user.setCreateBy("System");
        user.setUpdateDate(new Date());
        user.setUpdateBy("System");
        user.setType("user");

        return userRepository.save(user);
    }

    @Override
    public Object login(JSONObject reqVal) {
        JSONObject returnVal = new JSONObject();
        returnVal.put("status", false).put("description", "");

        List<User> userList = userRepository.findByUsername(reqVal.getString("username"));
        if (userList.size() == 0) {
            returnVal.put("description", "Invalid Account");
        } else {
            userList.forEach(mail -> {
                //                    User user = objectMapper.readValue(mail.toString(), User.class);

                if (mail.getPassword().equalsIgnoreCase(reqVal.getString("password"))) {
                    returnVal.put("status", true).put("description", "Login success.").put("username",mail.getUsername())
                            .put("firstname", mail.getFirstName()).put("lastname", mail.getLastName()).put("companyName", mail.getCompanyName())
                            .put("email", mail.getEmail()).put("tel", mail.getTel()).put("type",mail.getType());
                }
            });
        }

        return returnVal;
    }
}
