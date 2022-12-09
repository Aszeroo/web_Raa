package com.webraa.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/apis")
public class registerController {
    @RequestMapping(value = "/registeroutput", method = RequestMethod.POST)
//    @GetMapping("register")
    public String registerRoute(@RequestParam(value = "data", required = false) String flowId){
        System.out.println("tes");
        return "";
    }


}
