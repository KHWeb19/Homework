package com.example.demo.controller;


import com.example.demo.utility27th.Sequence;
import com.example.demo.utility27th.StudentScore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;

@Controller
public class First27thController {

    private static final Logger logger = LoggerFactory.getLogger(First27thController.class);

    @RequestMapping("/homework1_27th")
    public String homework1_27th(Model model){
        logger.info("client entered / homework1_27th");

        Sequence sequence = new Sequence(1,2,40);
        sequence.selectSequence();
        BigInteger selectnumber = sequence.getArrNumber();


        model.addAttribute("number",selectnumber);

        return "27th/homework1";
    }

    @RequestMapping("/homework2_27th")
    public String homework2_27th(Model model){
        logger.info("client entered / homework2_27th");

        StudentScore studentscore = new StudentScore(30,60,100);
        Thread t1 = new Thread(studentscore);
        t1.start();

        float average = studentscore.getAverage();
        model.addAttribute("threadNum",average);

        return "27th/homework2";
    }
}
