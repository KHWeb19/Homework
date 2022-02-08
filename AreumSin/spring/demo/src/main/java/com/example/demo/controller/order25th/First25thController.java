package com.example.demo.controller.order25th;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/*
    기본적으로 우리가 만드는 서비스라는 개념은 반드시 두가지 개념이 존재함.
    서버(Server)와 고객(Client) [공급자와 소유자]
    우리가 구동시킨 Spring Boot 서버(Server)는 말 그대로 Server에 해당함.

    우리가 만든 Cotroller에 URL을 용청하는 모든 사용자를 Client라고 함.


    Controller는 사용자가 웹상에서 URL(주소)를 요청할 때 동작함(물론 자신에게 요청할 때만)

 */

@Controller
public class First25thController {

    // Logger(로거)로 상태값을 확인할 수 있는 기록을 남기는 녀석임.
    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    // 현재 서버는 localhost:8080 으로 구동되고 있음.
    // 즉 localhost:8080/ 디폴트로 요청하면 이 코드가 동작하는것
    // 밑에는 주소 요청!!!
    @RequestMapping("/") // default를 입력하면 return값을 나타내줘
    public String home(Model model){
        logger.info("client entered /  (home)");
        // 올바르게 요청의 값을 알 수 있다.
        // 요청한 결과값을 확인할 수 있는 장치

        Date date = new Date();
        // Date는 날짜를 구해옴.
        // 숫자 형식으로 날짜를 가져왔으며
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        // 최종적으로 이 날짜값을 문자열로 변경하는 작업을 진행함.
        String formattedDate = dateFormat.format(date);

        // model.addAttribut()를 통해서
        // 특정한 속성값에 특정한 값을 저장할 수 있다.
        // 조금 쉽게 생각하자면 Map의 key와 value라고 봐도 무방하다.
        // attributeName에 해당하는 servTime이 key 값이고
        // 문자열로 변경된 날짜값이 value로 지정된 형태임.
        model.addAttribute("servTime", formattedDate);

        // Controller는 결론적으로 무엇을 했었나?
        // 사용자가 요청한 URL을 처리함.
        // resources/templates/25th/home.html
        return "25th/home";
    }

    @RequestMapping("/test") // default를 입력하면 return 값을 나타내줘
    public String test(Model model) {
        logger.info("client entered / test");
        int num = 3+7;

        // 자바 map의 역활을 하고 있는것.
        model.addAttribute("number", num);
        return "25th/test";
    }
}
