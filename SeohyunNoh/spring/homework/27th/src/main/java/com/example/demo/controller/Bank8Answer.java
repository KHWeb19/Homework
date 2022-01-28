package com.example.demo.controller;

import com.example.demo.utility.AvgTest;
import com.example.demo.utility.Sequence;
import com.example.demo.utility.school.SchoolClass;
import com.example.demo.utility.series.KindsOfSequence;
import com.example.demo.utility.series.MySequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// 이게 들어가면 아래쪽에서 경로 입력할 때
// 무조건 /28th/~~~/ 형태로 URL요청함 >> 경로 충돌 막기위해서 쓴 것
@RequestMapping("/28th")
public class Bank8Answer {
    private final static Logger logger =
            LoggerFactory.getLogger(Bank8Controller.class);

    @RequestMapping("/homework1")
    public String bank8homework1(Model model){
        logger.info("homework1");

        // geometric : 등비
        MySequence sequence = new MySequence(2, KindsOfSequence.GEOMETRIC);
        sequence.calcSequenceOrder(31);

        model.addAttribute("sequence", sequence.getResult());

        return "28th/homework1";
    }

    @RequestMapping("/homework2")
    public String bank8homework2(Model model){
        logger.info("homework2");

        SchoolClass sc = new SchoolClass(30,60);
        sc.doEnglishExam();
        sc.calcClassMean();

        model.addAttribute("classMean", sc.getClassMean());

        return "28th/homework2";
    }
}
