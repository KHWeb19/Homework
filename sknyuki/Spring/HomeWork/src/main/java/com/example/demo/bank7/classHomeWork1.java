package com.example.demo.bank7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class classHomeWork1 {
    private static final Logger logger = LoggerFactory.getLogger(classHomeWork1.class);
    int range=6;

    @RequestMapping("/homeWork1")
    public String homeWork1(Model model) {
        logger.info("client entered /homeWork2");

        int diceNum =(int)((Math.random()*range)+1);

        model.addAttribute("number", diceNum);

        return "homeWorkBank7/homeWork1";
    }
    @RequestMapping("/homeWork2")
    public String homeWork2(Model model) {
        logger.info("client entered /homeWork2");

        int diceNum = (int) (Math.random() * range);

        model.addAttribute("number", diceNum);

        return "homeWorkBank7/homeWork2";
    }
}