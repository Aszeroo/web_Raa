package com.webraa.demo.controllers;


import com.webraa.demo.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class AppController {

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

    @GetMapping("MyAssessments")
    public String MyAssessmentsRoute(HttpSession session, HttpServletResponse response, HttpServletRequest request, Model model) {
        model.addAttribute("username", session.getAttribute("username"));
        model.addAttribute("firstname", session.getAttribute("firstname"));
        model.addAttribute("lastname", session.getAttribute("lastname"));
        model.addAttribute("companyName", session.getAttribute("companyName"));
        model.addAttribute("type", session.getAttribute("type"));
        return "pages/MyAssessments";
    }

    @GetMapping("assessment_configuration")
    public String assessment_configurationRoute() {
        return "pages/assessment_configuration";
    }

    @GetMapping("assessment")
    public String assessmentRoute() {
        return "pages/assessment";
    }

    @GetMapping("Results")
    public String ResultsRoute() {
        return "pages/Results";
    }

    @GetMapping("index")
    public String indexRoute() {
        return "pages/index";
    }




}
