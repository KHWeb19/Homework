package com.example.demo.controller;

import com.example.demo.utility.Sequence;
import com.example.demo.utility.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hw26thController {
    private static final Logger logger = LoggerFactory.getLogger(Hw26thController.class);

    @RequestMapping("/homework1")
    public String homework1 (Model model){
//        아래와 같은 등비 수열이 있다.
//        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
//        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
//                (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임

        logger.info("client entered /homework1");

        Sequence seq = new Sequence(40);
        seq.sequenceMaker();
        model.addAttribute("arrNum",seq.toString());

        return "26th/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2 (Model model){
//   학생 30명이 있다.
//   이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
//   이 상태에서 학생들의 점수를 임의로 배치하고
//   학급의 평균값을 구해보도록 한다.

        logger.info("client entered /homework2");

        Student student = new Student(30);
        student.score();
        student.calcAverage();

        model.addAttribute("scoreSum",student.getSum());
        model.addAttribute("scoreAvg",student.getAvg());

        return "26th/homework2";
    }
}
