package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7  {


    private static final Logger logger = LoggerFactory.getLogger(Bank7.class);

    @RequestMapping("/homework1")
    public String homework1 (Model model){
        logger.info("client entered /homework1");

        int MIN=1;
        int MAX=6;
        int range=MAX-MIN+1;

        int num =(int)(Math.random()*range)+MIN;

        model.addAttribute("random",num);

        return "25th/homework1";




    }


}
