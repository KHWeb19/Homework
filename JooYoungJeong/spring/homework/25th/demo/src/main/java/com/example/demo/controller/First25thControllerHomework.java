package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller

public class First25thControllerHomework {

    private static final Logger logger = LoggerFactory.getLogger(First25thControllerHomework.class);

    @RequestMapping("/") // ("/") 이게 뭘 의미 하는지 잘 모르겠습니다 기본 페이지 (localhost:8080) 인가요?

    public String home(Model model) {
        logger.info("client entered /home");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("servTime", formattedDate);


        return "25thhomework/home";  // templates - 25thhomework - home.html 의 경로 인가요?
    }
}
/*
    @RequestMapping("/homework1") //
    public String homework1(Model model) {
        logger.info("client entered /homework1");

        //주사위 만들기

        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

        int dice3 = dice1 + dice2;


        model.addAttribute("dice", dice3);

        return "25thhomework/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2(Model model) {
        logger.info("client entered /homework2");

        // 3초마다 변수값 1 증가

        return "25thhomework/homework2";
    }
}
*/

