package com.example.demo.controller;

import com.example.demo.Bank8_2.Average;
import com.example.demo.utility.Sequence;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
public class Bank8Controller {

    @RequestMapping("/homework1")
    public String bank8Homework1 (Model model){
    log.info("homework1");

    model.addAttribute("num", Sequence.getTotalNum(21));

    return "26th/homework8";
    }

    @RequestMapping("/homework2")
    public String bank8Homework2(Model model){
        log.info("homework2");

        Average avg= new Average();
        avg.studentScore();

        model.addAttribute("avg",avg.getAverage());

        return "26th/homework8Num2";
    }

}


