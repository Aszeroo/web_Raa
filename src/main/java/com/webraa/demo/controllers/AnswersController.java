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
@RequestMapping("/apis/answer")
public class AnswersController {



}
