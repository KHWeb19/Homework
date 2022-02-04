package com.example.demo.controller.order27th;


import com.example.demo.utility.utility27th.scoreCalc.Exam;
import com.example.demo.utility.utility27th.scoreCalc.Subject;
import com.example.demo.utility.utility27th.Sequence;
import com.example.demo.utility.utility27th.StudentScore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;

@Controller
@RequestMapping("/27th")
public class First27thController {

    private static final Logger logger = LoggerFactory.getLogger(First27thController.class);

    @RequestMapping("/homework1")
    public String homework1(Model model){
        logger.info("client entered /27th /homework1");

        int rand = (int)(Math.random() * 99) + 1;

        Sequence sequence = new Sequence(1,2,rand);
        sequence.selectSequence();

        BigInteger selectedNumber = sequence.getNum();
        int numSelect = rand;

        model.addAttribute("number", selectedNumber);
        model.addAttribute("numSelect", numSelect);

        return "27th/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2(Model model){
        logger.info("client entered /27th / homework2");

        StudentScore studentscore = new StudentScore(30,60,100);
        Thread t1 = new Thread(studentscore);
        t1.start();

        //thread.join() ----- 쓰레드 종료될때까지 기다림!
        try{
            t1.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        float average = studentscore.getAverage();
        model.addAttribute("averageNum",average);

        return "27th/homework2";
    }

    @RequestMapping("/fix/homework2")
    public String homework2_fix(Model model){
        logger.info("client entered /27th /fix /homework2");

        Exam exam = new Exam(30,60,100);
        Subject subject = new Subject();

        exam.examStart();
        exam.calcScore();

        float avgSub1 = exam.getAverage(0);
        float avgSub2 = exam.getAverage(1);
        float avgSub3 = exam.getAverage(2);

        model.addAttribute("avgSub1", avgSub1);
        model.addAttribute("avgSub2", avgSub2);
        model.addAttribute("avgSub3", avgSub3);
        model.addAttribute("subName1", subject.getSubjectName(0));
        model.addAttribute("subName2", subject.getSubjectName(1));
        model.addAttribute("subName3", subject.getSubjectName(2));

        return "27th/fixedhomework2";
    }
}
