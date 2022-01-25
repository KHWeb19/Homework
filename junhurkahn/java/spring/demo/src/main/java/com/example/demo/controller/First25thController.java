package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/*
Controller는 사용자가 웹상에서 URL(주소)를 요청할 때 동작함 (물론 자신에게 요청할 때만)
 */
@Controller
public class First25thController {

    // Logger(로거)로 상태값을 확인할 수 있는 기록을 남기는 녀석임
    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    // 현재 서버는 localhost:8080 으로 구동되고 있음
    // 즉 localhost:8080/ 디폴트로 요청하면 이 코드가 동작하는 것임

    @RequestMapping("/homework1")
    public String test (Model model) {
        logger.info("client entered /test");

        int max = 6;
        int min = 1;
        int rang = max-min+1;
        int rand = (int) (Math.random() * rang + min);


        model.addAttribute("number",rand);

        return "25th/test";
    }
}
