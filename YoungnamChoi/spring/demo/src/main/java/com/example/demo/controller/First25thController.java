package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/*
컨트롤러는 사용자가 웹상에서 url을 요청할 때 동작함(문론 자신에게 효청할 때만)
 */
@Controller //주소 입력을 처리하는 것
public class First25thController {

    //로가로 상태값을 확인할 수 있는 기록을 남기는 녀석임
    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    //현재 서버는 8080으로 구동되고 있고
    //즉 8080으로 요청하면 다음 코드가 실핼
    @RequestMapping("/")//디폴트  주소를 요정하는 곳
    public String home(Model model){
        logger.info("client entered/ (home)");

        //data는 날짜를 구해준다.
        Date date = new Date();
        //숫자 형식으러 날자를 가져왔으며
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        //최종적으로 이 날짜 값을 문자열로 변경하는 작업을 진행함
        String formattedDate = dateFormat.format(date);
        //model,addAttribute를 통해서
        //특정한 속성값에 특정한 값을 지정 할 수 이ㅛ디,
        //Map의 key value값과 비슷하고
        //addattribute 에 servTime이 ket이고 문자열이 formattdDate가 value이다.
        model.addAttribute("servTime",  formattedDate);


        //controller는 결론적으로 무엇을 하나?
        //사용자가 요청한 url을 처리하고
        //resource/templates/25th/home
        return "25th/home"; //home을 보여줘

    }
    @RequestMapping("/test")//디폴트
    public String test(Model model) {
        logger.info("client entered/ test");

        int num = 3 + 7;

        model.addAttribute("number", num);

        return "25th/test";
    }
}
