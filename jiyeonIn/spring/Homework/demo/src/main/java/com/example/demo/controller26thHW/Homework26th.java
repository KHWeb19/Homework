package com.example.demo.controller26thHW;

import com.example.demo.utility.School.School;
import com.example.demo.utility.nomal.GeometricProgression;
import com.example.demo.utility.School.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/26th")
public class Homework26th {

    @RequestMapping("/homework3")
    public String homework3(Model model){
        log.info("client entered/homework3");

        GeometricProgression gp = new GeometricProgression(2,31);
        gp.findGeometric();

        model.addAttribute("Geometric",gp.getTmp());

        return "26thHW/homework3";
    }

    @RequestMapping("/homework4")
    public String homework4(Model model) {
        log.info("client entered/homework4");

        School sl = new School(30,60);
        sl.checkStudentScore();
        sl.sumStudentScore();
        sl.avgStudentScore();


        model.addAttribute("student",sl.getAvg());

        return "26thHW/homework4";
    }
}
