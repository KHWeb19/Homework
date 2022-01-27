package com.example.demo.controller;

import com.example.demo.utility.sequence.GeometricSequence;
import com.example.demo.utility.student.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8Dash27thController {

    private final static Logger logger = LoggerFactory.getLogger(Bank8Dash27thController.class);

    @RequestMapping("PB0301")
    public String bank8Homework1(Model model){
        GeometricSequence sequence = new GeometricSequence(50);

        model.addAttribute("seqIndex", sequence.getLastIndex());
        model.addAttribute("seqResult", sequence.getLastElement());

        return "27th/PB0301";
    }

    @RequestMapping("PB0302")
    public String bank8Homework2(Model model){

        Student myStudent = new Student();

        model.addAttribute("studentAvg", myStudent.getAverage());

        return "27th/PB0302";
    }
}
