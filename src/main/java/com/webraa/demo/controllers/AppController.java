package com.webraa.demo.controllers;


import com.webraa.demo.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {

    @GetMapping("login")
    public String loginRoute() {
        return "pages/login";
    }

    @GetMapping("register")
    public String registerRoute(Model model) {
        model.addAttribute("newUser", new User());
        return "pages/register";
    }

    @GetMapping("MyAssessments")
    public String MyAssessmentsRoute() {
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




}
