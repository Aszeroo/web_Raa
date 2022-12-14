package com.webraa.demo.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webraa.demo.entities.User;
import com.webraa.demo.models.ApiResponseError;
import com.webraa.demo.models.ApiResponseSuccess;
import com.webraa.demo.services.UserService;
import org.hibernate.Session;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResponseEntity<?> loginUser(@RequestBody String obj, HttpSession session, HttpServletResponse response) {
        try {
            JSONObject reqVal = new JSONObject(obj);
            JSONObject sessionObj = new JSONObject(userService.login(reqVal).toString());

            if (sessionObj.getBoolean("status")) {
                session.setAttribute("username",sessionObj.getString("username"));
                session.setAttribute("firstname",sessionObj.getString("firstname"));
                session.setAttribute("lastname",sessionObj.getString("lastname"));
                session.setAttribute("companyName",sessionObj.getString("companyName"));
                session.setAttribute("type",sessionObj.getString("type"));

            }
            return ResponseEntity.ok(new ApiResponseSuccess("Login User successful.", objectMapper.readValue(sessionObj.toString(), Object.class)));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.internalServerError().body(new ApiResponseError("US0002" +
                    "", "Can not login user"));
        }
    }
}
