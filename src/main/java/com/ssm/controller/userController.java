package com.ssm.controller;

import org.springframework.stereotype.Controller;

@Controller
public class userController {

    public  String  hello(){
        System.out.println(111);
        return "index";
    }
}
