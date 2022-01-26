package com.example.demo.controller26thHW;

import com.example.demo.utility.nomal.Student;
import com.example.demo.utility.thread.GeometricProgression;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Homework26th {
    private static final Logger logger = LoggerFactory.getLogger(Homework26th.class);

    @RequestMapping("/homework3")
    //숙제 25th에 homework1이 있어서 오류로 나옵니다. 혹시 다르게 하는 방법이 있나요?
    public String homework3(Model model){
        logger.info("client entered/homework3");

        model.addAttribute("Geometric",GeometricProgression.getGeometric());

        return "26thHW/homework3";
    }

    @RequestMapping("/homework4")
    //숙제 25th에 homework1이 있어서 오류로 나옵니다. 혹시 다르게 하는 방법이 있나요?
    public String homework4(Model model) {
        logger.info("client entered/homework4");

        Student st = new Student();
        st.eachStudentScore();
        st.sumStudentScore();

        model.addAttribute("student",Student.avgStudentScore());

        return "26thHW/homework4";
    }
}
