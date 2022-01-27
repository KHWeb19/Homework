package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller //주소를 입력하고 처리하는것 @Controller
public class First25thController {

    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    @RequestMapping("/")
    public String home (Model model) {
        logger.info("client entered / (home)"); //올바르게 작동하였는지 확인을 위한 장치 (디버깅)

        // Date는 날자를 구해옴
        Date date = new Date();
        // 숫자 형식으로 날자를 가져왔으며
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        // 최종적으로 이 날자 값을 문자열로 변경하는 작업을 진행함
        String formattedDate = dateFormat.format(date);
        // model.addAttribute() 를 통해서
        // 특정한 속성값에 특정한 값을 저장할 수 있다.
        // 조금 쉽게 생각하자면 Map의 key, value라 봐도 무방함
        // attributeName에 해당하는 servTime이 key값이고
        // 문자열로 변경된 날자값이 value로 저장된 형태임
        model.addAttribute("servTime", formattedDate);

        // Controller는 결론적으로 무엇을 했었나?
        // 사용자가 요청한 URL을 처리함
        // resources/templates/25th/home.html 을 보여줘라
        return "25th/home"; //25th/ 붙이는 이유

    }

    @RequestMapping("/test") //http://localhost:8080/test 로 이동하여 확인
    public String test (Model model) {
        logger.info("client entered /test");

        int num = 3 + 7;

        model.addAttribute("number", num); // model.addAttribute = Map의 역활을 함

        return "25th/test";
    }
}
