package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Homework1 {

    private static final Logger logger = LoggerFactory.getLogger(Homework1.class);

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        logger.info("client entered /homework1");

        //주사위 만들기

        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

        int dice3 = dice1 + dice2;


        model.addAttribute("dice", dice3);

        return "25thhomework/homework1";
    }
}
