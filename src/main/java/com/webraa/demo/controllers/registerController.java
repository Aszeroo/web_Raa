package com.webraa.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/apis")
public class registerController {
    @RequestMapping(value = "/registeroutput", method = RequestMethod.POST)
//    @GetMapping("register")
    public String registerRoute
        (HttpServletResponse response,
         @RequestBody String data, HttpSession session){
        System.out.println(data);
        return "";
    }


}
