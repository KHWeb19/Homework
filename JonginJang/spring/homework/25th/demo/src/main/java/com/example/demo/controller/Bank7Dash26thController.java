package com.example.demo.controller;

import com.example.demo.utility.Dice;
import com.example.demo.utility.thread.ThreadWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller //쓰레드화, controller는 controller의 역할만 하도록
            // 다른 기능들은 별도로 클래스화한다.
public class Bank7Dash26thController {

    private final static Logger logger =
            LoggerFactory.getLogger(Bank7Dash26thController.class);

    // 현재 서버는 localhost:8080 으로 구동되고 있음
    // 즉 localhost:8080/ 디폴트로 요청하면 이 코드가 동작하는 것임
    @RequestMapping("/")
    public String home (Model model) {
        logger.info("client entered / (home)");

        // Date는 날자를 구해옴
        Date date = new Date();
        // 숫자 형식으로 날자를 가져왔으며
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        // 최종적으로 이 날자값을 문자열로 변경하는 작업을 진행함
        String formattedDate = dateFormat.format(date);
        // model.addAttribute()를 통해서
        // 특정한 속성값에 특정한 값을 저장할 수 있다.
        // 조금 쉽게 생각하자면 Map의 key, value라 봐도 무방함
        // attributeName에 해당하는 servTime이 key값이고
        // 문자열로 변경된 날자값이 value로 저장된 형태임
        model.addAttribute("servTime", formattedDate);

        // Controller는 결론적으로 무엇을 했었나 ?
        // 사용자가 요청한 URL을 처리함
        // resources/templates/25th/home.html 을 보여줘라
        return "25th/home";
    }

    @RequestMapping("/test")
    public String test (Model model) {
        logger.info("client entered /test");

        int num = 3 + 7;

        model.addAttribute("number", num);

        return "25th/test";
    }
    @RequestMapping("/homework1")
    public String bank7Homework1 (Model model) {
        logger.info("homework1");
        Dice dice = new Dice(); //Dice타입의 객체를 생성한다.
        dice.rollDice();

        model.addAttribute("diceNum", dice.getDiceNum());
        // //Dice클래스의 lombok.DATa에서 자동게터를 제공하기 때문에 Getter 안 만들고 바로 사용

        return "25th/homework1";
    }

    @RequestMapping("/homework2")
    public String bank7Homework2 (Model model) {
        logger.info("homework2");

        model.addAttribute("threadNum", ThreadWorker.getSyncLockTest());
        //threadNum을 키값으로 현재 값 가져오도록 설정
        return "25th/homework2";  //리턴이 있기 때문에 RequestMapping에서는 무한반복이 동작하지 X
    }
}