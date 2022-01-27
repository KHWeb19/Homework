package com.example.demo.controller;

import com.example.demo.utility.AvgTest;
import com.example.demo.utility.Sequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Bank8Controller {
    private final static Logger logger =
            LoggerFactory.getLogger(Bank8Controller.class);

    @RequestMapping("/homework1")
    public String bank8homework1(Model model){
        logger.info("homework1");

        model.addAttribute("seqNum", Sequence.calcSequence());

        return "27th/homework1";
    }

    @RequestMapping("/homework2")
    public String bank8homework2(Model model){
        logger.info("homework2");

        model.addAttribute("totalScore", AvgTest.calcTotalScore());
        model.addAttribute("avgScore", AvgTest.calcAvgScore());
        return "27th/homework2";
    }
}
