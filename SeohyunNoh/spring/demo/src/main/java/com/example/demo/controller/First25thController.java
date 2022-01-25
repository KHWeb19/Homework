package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

// 클라이언트(수요자)가 주소 입력하는 걸 처리하는게 controller
// 밑의 1,2번을 처리하는게 controller임
@Controller
public class First25thController {

    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    // controller의 작업을 맵핑시키는 역할
    // 1. localhost:8080/ 디폴트로 입력하면
    @RequestMapping("/")
    public String home(Model model) {
        logger.info("client entered / (home) ");

        // 아래 3줄은 날짜를 갖고오고싶으면 무조건 사용
        // Date는 날짜를 구해옴
        Date date = new Date();
        // 숫자형식으로 날짜를 가져왔으며
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        // 최종적으로 이 날짜값을 문자열로 변경하는 작업
        String formattedDate = dateFormat.format(date);

        //밑의 2줄이 제일 중요
        // model.addAttribute()를 통해 특정한 속성값에 특정한 값을 저장할 수 있음
        // Map의 key, value라고 봐도 무방
        model.addAttribute("servTime", formattedDate);

        // 2. home을 보여줘!
        return "25th/home";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        logger.info("client entered /test");

        int num = 3 + 7;

        model.addAttribute("number", num);

        return "25th/test";
    }
}
