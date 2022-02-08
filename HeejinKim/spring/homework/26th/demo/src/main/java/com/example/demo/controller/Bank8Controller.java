package com.example.demo.controller;

import com.example.demo.Bank8_2.Average;
import com.example.demo.utility.Sequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8Controller {

    private final static Logger logger = LoggerFactory.getLogger(Bank8Controller.class);

    @RequestMapping("/homework1")
    public String bank8Homework1 (Model model){
    logger.info("homework1");

    model.addAttribute("num", Sequence.getTotalNum(21));

    return "26th/homework8";
    }

    @RequestMapping("/homework2")
    public String bank8Homework2(Model model){
        logger.info("homework2");

        model.addAttribute("avg", Average.getAverage());

        return "26th/homework8Num2";
    }

}


