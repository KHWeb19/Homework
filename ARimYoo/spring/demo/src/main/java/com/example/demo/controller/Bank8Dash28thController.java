package com.example.demo.controller;

import com.example.demo.utility.Series.GeoSequence;
import com.example.demo.utility.School.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8Dash28thController {

    private static final Logger logger = LoggerFactory.getLogger(Bank8Dash28thController.class);

    @RequestMapping("/homework3")
    public String homework1 (Model model){
        /*
        아래와 같은 등비 수열이 있다.
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        */

        logger.info("client entered / (homework3)");

        GeoSequence sq = new GeoSequence(2);
        sq.allocSequence(31);

        model.addAttribute("ratio", sq.getRatio());
        model.addAttribute("sequence", sq.getValue());

        return "27th/homework1";
    }

    @RequestMapping("/homework4")
    public String homework2 (Model model){
        /*
        반 학생이 30명이 있다.
        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        이 상태에서 학생들의 점수를 임의로 배치하고
        학급의 평균값을 구해보도록 한다.
        */

        logger.info("client entered / (homework4)");

        Student student = new Student(30);
        student.allocScore();

        model.addAttribute("studentNum", student.getStudentNum());
        model.addAttribute("average", student.getAverage());

        return "27th/homework2";
    }
}
