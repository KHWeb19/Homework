package com.example.demo.controller;

import com.example.demo.utility.Dice;
import com.example.demo.utility.thread.Worker25th;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Hw25thController {
    private static final Logger logger = LoggerFactory.getLogger(Hw25thController.class);

    @RequestMapping("/homework1")
    public String homework1 (Model model){
        logger.info("client entered /homework1");
        Dice dice = new Dice();
        dice.rollDice();
        model.addAttribute("randomNumber", dice.getDiceNum());
        return "25th/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2 (Model model) {
        logger.info("client entered /homework2");
        Worker25th wt = new Worker25th();
        model.addAttribute("testNum", wt.test);
        return "25th/homework2";
    }
}

