package com.example.homework.controller;

import com.example.homework.utility.Dice;
import com.example.homework.utility.Thread.ThreadWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/7th")
public class Bank7Controller {

    private final static Logger logger = LoggerFactory.getLogger(Bank7Controller.class);

    @RequestMapping("/homework1")
    public String bank7Homework1 (Model model){
        logger.info("client entered/homework1");
        Dice dice = new Dice();
        dice.rollDice();

        model.addAttribute("diceNum", dice.getDiceNum());

        return "7th/homework1";
    }

    @RequestMapping("/homework2")
    public String bank7Homework2 (Model model){
        logger.info("client entered/homework2");

        model.addAttribute("ThreadWorker", ThreadWorker.getNum());

        return "7th/homework2";
    }
}
