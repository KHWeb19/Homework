package com.example.demo.controller;

import com.example.demo.utillity.Raito;
import com.example.demo.utillity.Score;
import com.example.demo.utillity.thread.RaitoThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8pro {
    private final static Logger logger = LoggerFactory.getLogger(Bank8pro.class);

    @RequestMapping("/homework1")
    public String Homework1(Model model){
        logger.info("entered / homework1");

        Raito raito = new Raito();
        model.addAttribute("number", raito.getNumber());

        return "26th/homework1";
    }

    @RequestMapping("/homework2")
    public String Homework2(Model model){
        logger.info("entered / homework2");

        Score score = new Score();
        score.addScore();
        model.addAttribute("score", score.getAvg());

        return "26th/homework2";
    }

    @RequestMapping("/homework3")
    public String Homework3(Model model){
        logger.info("entered / homework3");

        model.addAttribute("threadNum", RaitoThread.addNum());
        //model.addAttribute("threadNum", RaitoThread.getNumber());

        return "26th/homework3";
    }
}
