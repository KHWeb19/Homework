package com.example.demo.controller;

import com.example.demo.utility.Dice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7Dash26thController {

    private static final Logger logger = LoggerFactory.getLogger(Bank7Dash26thController.class);

    @RequestMapping("/homework1")
    public String Dice (Model model){

        logger.info("client entered / (home)");

        Dice dice = new Dice();
        dice.allocDice();

        model.addAttribute("diceNum", dice.getDiceNum());

        return "26th/dice";

    }
}
