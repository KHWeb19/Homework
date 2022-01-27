package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homework2 {

    private static final Logger logger = LoggerFactory.getLogger(Homework2.class);

    @RequestMapping("/homework2")

    public String homework2(Model model) {
        logger.info("client entered /homework2");

        // 3초마다 변수값 1 증가

        return "25thhomework/homework2";
    }
}
