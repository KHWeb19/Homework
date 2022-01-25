package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller

public class First25thControllerHomework {

    private static final Logger logger = LoggerFactory.getLogger(First25thControllerHomework.class);

    @RequestMapping("/")

    public String home (Model model) {
        logger.info("client entered / (home)");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("servTime", formattedDate);

        return "25thHomework/home"; //25th/ 붙이는 이유
    }

    @RequestMapping("/homework1")
    public String test (Model model) {
        logger.info("client entered /homework1");

        int num = 3 + 7; //주사위 만들기

        model.addAttribute("number", num);

        return "25th/homework";
    }
}