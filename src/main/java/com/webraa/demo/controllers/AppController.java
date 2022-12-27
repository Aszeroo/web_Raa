package com.webraa.demo.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webraa.demo.entities.User;
import com.webraa.demo.entities.Answerdata;
import com.webraa.demo.services.AnswersService;
import com.webraa.demo.services.impl.AnswersServiceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class AppController {

    RestTemplate restTemplate;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    private AnswersService answersService;

    @GetMapping("login")
    public String loginRoute(Model model) {
        model.addAttribute("loginUser", new User());
        return "pages/login";
    }

    @GetMapping("register")
    public String registerRoute(Model model) {
        model.addAttribute("newUser", new User());
        return "pages/register";
    }

    @GetMapping("history")
    public String historyRoute(HttpSession session, HttpServletResponse response, HttpServletRequest request, Model model) {
        model.addAttribute("firstname", session.getAttribute("firstname"));
        model.addAttribute("username", session.getAttribute("username"));
        model.addAttribute("lastname", session.getAttribute("lastname"));
        model.addAttribute("companyName", session.getAttribute("companyName"));
        model.addAttribute("type", session.getAttribute("type"));
        return "pages/history";
    }


    @GetMapping("Results")
    public String ResultsRoute(Model model, HttpSession session, HttpServletResponse response, HttpServletRequest request, @RequestParam String roundId) throws JsonProcessingException {

        model.addAttribute("listAns", objectMapper.readValue(answersService.summaryAnswer(session.getAttribute("username").toString(), roundId).toString(), Answerdata[].class));
        model.addAttribute("firstname", session.getAttribute("firstname"));
        model.addAttribute("username", session.getAttribute("username"));
        model.addAttribute("lastname", session.getAttribute("lastname"));
        model.addAttribute("companyName", session.getAttribute("companyName"));
        model.addAttribute("type", session.getAttribute("type"));
        return "pages/Results";
    }

    @GetMapping("changepassword")
    public String changepasswordRoute(HttpSession session, HttpServletResponse response, HttpServletRequest request, Model model) {
        model.addAttribute("firstname", session.getAttribute("firstname"));
        model.addAttribute("username", session.getAttribute("username"));
        model.addAttribute("lastname", session.getAttribute("lastname"));
        model.addAttribute("companyName", session.getAttribute("companyName"));
        model.addAttribute("type", session.getAttribute("type"));
    return "pages/changepassword";
}

    @GetMapping("landingpage")
    public String landingpageRoute(HttpSession session, HttpServletResponse response, HttpServletRequest request, Model model) {
        model.addAttribute("firstname", session.getAttribute("firstname"));
        model.addAttribute("username", session.getAttribute("username"));
        model.addAttribute("lastname", session.getAttribute("lastname"));
        model.addAttribute("companyName", session.getAttribute("companyName"));
        model.addAttribute("type", session.getAttribute("type"));
        return "pages/landingpage";
    }


    @GetMapping("assessment")
    public String assessmentRoute(HttpSession session, HttpServletResponse response, HttpServletRequest request, Model model) {
        model.addAttribute("username",session.getAttribute("username"));
        model.addAttribute("firstname",session.getAttribute("firstname"));
        model.addAttribute("lastname",session.getAttribute("lastname"));
        model.addAttribute("companyName",session.getAttribute("companyName"));
        model.addAttribute("type",session.getAttribute("type"));
        return "pages/assessment";
    }



}
