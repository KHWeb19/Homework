package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

@Controller
public class Test7 {
    private static final Logger logger = LoggerFactory.getLogger(Test7.class);

    @RequestMapping("/homework1")
    public String homework1(Model model){
        logger.info("client entered/ homework1");

        int num = (int)(Math.random()*6+1);

        model.addAttribute("number",num);

        return "25th/homework1";

    }

    @RequestMapping("/homework2")
    public String homework2(Model model){
        logger.info("client entered/ homework2");




        return "25th/homework1";

    }

}
