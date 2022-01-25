package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // 사용자가 웹상에서 URL를 요청할 때 동작
public class First25thControllerHomework {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(First25thControllerHomework.class);
    // Logger로 상태값을 확인할 수 있는 기록을 남기는 녀석

    @RequestMapping(value = "/homework1")
    public String homework1(Model model) {
        logger.info("client entered / homework1 ");

        int dice = (int) (Math.random() * 6) + 1;

        if (dice == 1) {
            System.out.println("주사위1이 나왔습니다.");
        } else if (dice == 2) {
            System.out.println("주사위2가 나왔습니다.");
        } else if (dice == 3) {
            System.out.println("주사위3이 나왔습니다.");
        } else if (dice == 4) {
            System.out.println("주사위4가 나왔습니다.");
        } else if (dice == 5) {
            System.out.println("주사위5가 나왔습니다.");
        } else {
            System.out.println("주사위6이 나왔습니다.");
        }

        model.addAttribute("number", dice);

        return "25th/test";
        // Controller는 사용자가 요청한 URL을 처리한다.
        // templates/25th/home.html 을 보여주는 역할
    }
}

