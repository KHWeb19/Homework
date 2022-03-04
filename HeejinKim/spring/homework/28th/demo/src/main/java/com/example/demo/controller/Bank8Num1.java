package com.example.demo.controller;

import com.example.demo.utility.sequence.KindOfSequence;
import com.example.demo.utility.sequence.MySeqence;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.Sequence;

@Slf4j
@Controller
@RequestMapping("/28th")
public class Bank8Num1 {
    //static 은 공유가 필요할 때만 쓰자! ThreadWorker.test 일때는 명시적으로 전역변수라 하자!
    //스레드와 전역으로 공유가 필요하다.--할때 static 사용
    //메인에는 스레드로 하면 static을 적용해서 return을 해야함 ...getter가 사용이 안된다
    private final static Logger logger = LoggerFactory.getLogger(Bank8Num1.class);

    @RequestMapping("/homework1")
    public String bank8Homework1 (Model model){
        logger.info("homework1");

        MySeqence ms=new MySeqence(2, KindOfSequence.GEOMETRIC);
        ms.calcSeqCount(30);
        model.addAttribute("num",ms.getNum());

        return "28th/homework1";
    }

   /* @RequestMapping("/homework2")
    public String bank8Homework2(Model model){
        logger.info("homework2");

        model.addAttribute("avg", );

        return "28th/homework8Num2";
    }*/

}





