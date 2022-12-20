package com.webraa.demo.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webraa.demo.entities.User;
import com.webraa.demo.models.ApiResponseError;
import com.webraa.demo.models.ApiResponseSuccess;
import com.webraa.demo.services.QuestionService;
import com.webraa.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> findAllQuestion() {
        try {
            return ResponseEntity.ok(new ApiResponseSuccess("Save User successful.", questionService.findAll()));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.internalServerError().body(new ApiResponseError("US0001" +
                    "", "Can not save new user"));
        }
    }

}
