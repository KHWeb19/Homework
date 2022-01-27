package com.example.demo.controller25thHW;

import com.example.demo.utility.nomal.Dice;
import com.example.demo.utility.thread.ThreadManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Homework25th {

    private static final Logger logger = LoggerFactory.getLogger(Homework25th.class);

    @RequestMapping("/homework1")
    public String homework1(Model model){
        logger.info("client entered/homework1");

       Dice dice = new Dice();
       dice.rollDice();

        model.addAttribute("random",dice.getRolldice());

        return "25thHW/homework1";
    }



    @RequestMapping("/homework2")
    public String homework2(Model model) throws InterruptedException {
        logger.info("client entered/homework2");


        model.addAttribute("test", ThreadManager.getTest() );

        return "25thHW/homework2";
    }

}
