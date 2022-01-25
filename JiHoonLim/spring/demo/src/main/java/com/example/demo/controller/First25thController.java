package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class First25thController {

    // Logger -- 상태값을 확인할 수 있는 기록을 남김
    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    @RequestMapping("/")
    public String home(Model model) {
        logger.info("client entered / (home)");

        //Date -- 날짜
        Date date = new Date();
        // 숫자형식으로 가져옴
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        // 최종적으로 날자값을 문자열로 변경하는 작업
        String formattedDate = dateFormat.format(date);
        // model.addAttribute() -- 특정한 속성값에 특정한 값을 지정
        model.addAttribute("servTime", formattedDate);

        //Controller 는 결론적으로 사용자가 요청한 url을 처리
        return "25th/home";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        logger.info("client entered / (test)");

        int num = 3 + 7;

        model.addAttribute("number", num);

        return "25th/test";
    }
}
