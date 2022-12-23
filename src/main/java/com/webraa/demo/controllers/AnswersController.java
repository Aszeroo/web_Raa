package com.webraa.demo.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webraa.demo.entities.User;
import com.webraa.demo.models.ApiResponseError;
import com.webraa.demo.models.ApiResponseSuccess;
import com.webraa.demo.services.AnswersService;
import com.webraa.demo.services.UserService;
import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/apis/answer")
public class AnswersController {

    @Autowired
    AnswersService answersService;

    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "allanswer", method = RequestMethod.POST)
    public ResponseEntity<?> saveanswer(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody String reqBody) {
        try {
            JSONArray requestSave = new JSONArray(reqBody);
            return ResponseEntity.ok(new ApiResponseSuccess("Save Answers successful.", answersService.saveAll(requestSave)));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.internalServerError().body(new ApiResponseError("US0001" +
                    "", "Can not save new answers"));
        }
    }

    @RequestMapping(value = "summary-answer/{username}", method = RequestMethod.GET)
    public ResponseEntity<?> summaryAnswer(HttpServletRequest request, HttpServletResponse response, HttpSession session, @PathVariable String username) {
        try {
            return ResponseEntity.ok(new ApiResponseSuccess("Find Answers successful.", objectMapper.readValue(answersService.summaryAnswer(username).toString(), Object.class)));
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.internalServerError().body(new ApiResponseError("US0002" +
                    "", "Can not find new answers"));
        }
    }


}
