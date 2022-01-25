package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class SquareController {
    private static final Logger logger = LoggerFactory.getLogger(SquareController.class);

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        logger.info("client entered /homework1");

        final int Max = 6;
        final int Min = 1;

        int range = Max - Min + 1;

        int squareNum = (int) (Math.random() * range + Min);


        model.addAttribute("number", squareNum);

        return "25th/homework1";
    }


}














