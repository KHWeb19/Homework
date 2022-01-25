package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeworkController25th {

    private static final Logger logger = LoggerFactory.getLogger(homeworkController25th.class);

    homework25th hw = new homework25th();

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        logger.info("client entered / (homework1)");

        model.addAttribute("comment",hw.printDice());
        model.addAttribute("number", hw.rollDice());

        return "25th/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2(Model model) throws InterruptedException {
        logger.info("client entered / (homework2)");


        // model.addAttribute("number", );

        return "25th/homework2";
    }
}
