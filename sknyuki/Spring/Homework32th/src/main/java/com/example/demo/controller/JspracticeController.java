package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/Jspractice")
public class JspracticeController {
    @GetMapping("/useJPA")
    public String getuseJPA(){
        log.info("getjpa");

        return "/27th/JSpractice";
    }

    
}
