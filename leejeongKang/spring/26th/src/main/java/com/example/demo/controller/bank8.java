package com.example.demo.controller;

import com.example.demo.utility.Score;
import com.example.demo.utility.Sequence;
import com.example.demo.utility.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bank8 {
    private static final Logger logger= LoggerFactory.getLogger(bank8.class);

    @RequestMapping("/homework1")
    public String solution1 (Model model){
        Sequence sequence = new Sequence();
        sequence.inputUser();
        sequence.calcSeq();
        model.addAttribute("sequence", sequence.getSeq());

        return "26th/sequence";
    }

    @RequestMapping("/homework2")
    public String solution2 (Model model){
        logger.info("entered / homework2");
        Score score = new Score();
        score.studentScore();
        score.calcSum();

        model.addAttribute("avg",score.getAvg());

        return "26th/score";
    }
    /*@RequestMapping("/homework3")
    public String test (Model model){
        logger.info("entered / homework3");
        test test = new test();
        model.addAttribute("num",test.number());

        return "26th/test";

    }*/

}
