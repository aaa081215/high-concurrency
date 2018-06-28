package com.fc.Current.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class textController {
    Integer n=1000;
    @RequestMapping("/safetest")
    @ResponseBody
    public String test(){
        System.out.println((n--).toString());
        return (n--).toString();
    }
}
