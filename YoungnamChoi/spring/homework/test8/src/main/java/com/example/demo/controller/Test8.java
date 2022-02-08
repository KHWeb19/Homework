package com.example.demo.controller;

import com.example.demo.utility.Geometric;
import com.example.demo.utility.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test8 {
    private static final Logger logger = LoggerFactory.getLogger(Test8.class);

    @RequestMapping("/homework1")
    public String test8 (Model model) {
        Geometric geometric = new Geometric();
        geometric.allocGeometric();

        model.addAttribute("num",geometric.getNum());

        return "26th/homework1";
    }
    @RequestMapping("/homework2")
    public String test (Model model) {
        Student student = new Student();
        student.avgScore();

        model.addAttribute("STUDENT_NUM",student.getAvg());

        return "26th/homework2";
    }
}
