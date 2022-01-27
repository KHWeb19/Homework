package com.example.demo.controller;


import com.example.demo.utility.GeometricSequence;
import com.example.demo.utility.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8n26thController {

    private final static Logger logger =
            LoggerFactory.getLogger(Bank8n26thController.class);

    @RequestMapping("/homework1")
    public String bank8Homework1(Model model) {
        logger.info("client entered /homework1");
        GeometricSequence gs = new GeometricSequence();
        gs.inputIndex();
        gs.sequenceGenerator();

        model.addAttribute("selnum", gs.inputIndex());
        model.addAttribute("seqarr", gs.sequenceGenerator());

        return "26th/homework1";
    }

    @RequestMapping("/homework2")
    public String bank8Homework2(Model model) {
        logger.info("client entered /homework2");
        Student student = new Student();
        student.init();
        student.score();
        student.average();

        model.addAttribute("stuscore",student.score());
        model.addAttribute("average", student.average());

        return "26th/homework2";
    }


}
