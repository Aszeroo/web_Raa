package com.webraa.demo.controllers;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webraa.demo.entities.User;
import com.webraa.demo.models.ApiResponseError;
import com.webraa.demo.models.ApiResponseSuccess;
import com.webraa.demo.services.UserService;
import org.hibernate.Session;
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

@RestController
@RequestMapping("/apis/answer")
public class AnswersController {
    public static HttpHeaders headersJSON;
    @RequestMapping(value = "allanswer", method = POST)
    @ResponseBody
    public ResponseEntity<?> saveanswer(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestBody String reqBody) {
        JSONObject returnVal = new JSONObject();

        System.out.println("check => "+reqBody);
        return (new ResponseEntity<>(returnVal.toString(), headersJSON, HttpStatus.OK));
    }



}
