package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8Controller {

    private static final Logger logger = LoggerFactory.getLogger(Bank8Controller.class);


    @RequestMapping("/homework3")
    public String homework1 (Model model){

        logger.info("client entered / (homework1)");

        BANK3 bank3 = new BANK3(1,1,1,0,0,3,20);


        model.addAttribute("ratio", bank3.getResult());

        return "27th/homework1";
    }

}