package com.example.demo.controller;

import com.example.demo.utility.Dice;
import com.example.demo.utility.school.SchoolClass;
import com.example.demo.utility.series.KindsOfSequence;
import com.example.demo.utility.series.MySequence;
import com.example.demo.utility.thread.ThreadWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/28")
public class Bank8Dash28thController {

    private final static Logger logger =
            LoggerFactory.getLogger(Bank8Dash28thController.class);

    //등비수열 2^0~31 까지 구하기
    @RequestMapping("/homework1")
    public String bank8Homework1 (Model model) {

        MySequence sequence = new MySequence(2, KindsOfSequence.GEOMETRIC);
        sequence.calcSequenceOrder(31);

        model.addAttribute("sequence", sequence.getResult());

        return "28th/homework1";
    }

    //학생 30명의 영어 점수를 임의로 배치하고 학급의 평균값을 구해보도록 한다.
    //이때 모든 학생들의 점수에 60점 미만은 없다.
    @RequestMapping("/homework2")
    public String bank8Homework2 (Model model) {
        logger.info("homework4");

        SchoolClass sc = new SchoolClass(30, 60);

        model.addAttribute();

        return "28th/homework2";
    }
}