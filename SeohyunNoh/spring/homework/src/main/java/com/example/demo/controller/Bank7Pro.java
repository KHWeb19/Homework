package com.example.demo.controller;

import com.example.demo.utility.Dice;
import com.example.demo.utility.thread.ThreadTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7Pro {
    // /homework1 URL을 요청하면
    // 주사위를 굴려서 주사위 값을 화면에 출력되게 만들어보자!

    private static final Logger logger = LoggerFactory.getLogger(Bank7Pro.class);

    @RequestMapping("/homework1")
    public String homework1(Model model){
        logger.info("client entered /homework1");

        Dice dice = new Dice();
        dice.rollDice();

        model.addAttribute("diceGame", dice.getRand());

        return "Bank7/pro1";
    }

    @RequestMapping("/homework2")
    public String homework2(Model model){
        // 스프링부트에 스레드 구현하는 방법 구글링해보니
        // 내 방법은 완전 틀렸는데...?
        // 일단 클래스 만들어서 작성

        logger.info("client entered /homework2");

        model.addAttribute("varTest", ThreadTest.getSyncTest());

        return "Bank7/pro2";
    }
}
