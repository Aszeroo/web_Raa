package com.webraa.demo.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webraa.demo.entities.User;
import com.webraa.demo.models.ApiResponseError;
import com.webraa.demo.models.ApiResponseSuccess;
import com.webraa.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis/user")
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        try {
            return ResponseEntity.ok(new ApiResponseSuccess("Save User successful.", userService.save(user)));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.internalServerError().body(new ApiResponseError("US0001" +
                    "", "Can not save new user"));
        }
    }
}
