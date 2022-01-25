package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homework {

    private static final Logger logger = LoggerFactory.getLogger(Homework.class);

    @RequestMapping("/homework1")
    public String test(Model model) {
        logger.info("client entered/ (homework1)");

        int rand = (int)(Math.random() * 9 +1);

        model.addAttribute("random", rand);

        return "25th/homework1";
    }


}
