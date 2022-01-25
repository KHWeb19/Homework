package com.example.demo.controller;

import hw2.Hw2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Hw25thController {
    private static final Logger logger = LoggerFactory.getLogger(Hw25thController.class);

    @RequestMapping("/homework1")
    public String homework1 (Model model){
        logger.info("client entered /homework1");
        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        int randomNum = (int) (Math.random() * range) + MIN;
        model.addAttribute("randomNumber", randomNum);
        return "25th/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2 (Model model) throws InterruptedException {
        logger.info("client entered /homework2");
//       [요구 사항]
//       1. 변수에 3초마다 1 증가 시키기 -> ++, sleep
//       2. test 값 출력 하기 -> 외부 패키지에서 클래스 작업한거 import
//          (test 값은 새로고침시 증가 되어야 하는 것 같음)

//       아는 범위 내에서 별짓을 해봤지만 해결 못함
//       1) while을 써봄 -> 아예 실행이 안됨. break 시점을 몰라서 망함
//       2) thread 써봄 -> 변수에 1만 더해지고 끝남. 값이 계속 누적이 안됨
//         thread 사용 미숙으로 발생한 문제인듯?
//         강사님처럼 배열에 넣어서 써야하는것 같기도 한데.. 해결방안 모름

        int test = 1;
        model.addAttribute("testNum", test);
        return "25th/homework2";
    }
}

