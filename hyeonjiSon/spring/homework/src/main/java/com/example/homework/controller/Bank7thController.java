package com.example.homework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7thController {

    private static final Logger logger = LoggerFactory.getLogger(Bank7thController.class);

    //1. /homework1 URL을 요청하면
    //   주사위를 굴려서 주사위 값을 화면에 출력되게 만들어보자!
    @RequestMapping("/homework1")
    public String homework1 (Model model){
        logger.info("client entered / homework1");

        int dice = (int)(Math.random()*6+1);

        model.addAttribute("dice", dice);

        return "7th/homework1";
    }

    //2. 3초마다 test라는 변수의 값을 1씩 증가시키도록 한다.
    //   또한 /homework2 URL을 요청하면
    //   현재의 test 값을 화면에 출력되게 만들어보자!

    @RequestMapping("/homework2")
    public String homework2(Model model) throws InterruptedException {
        logger.info("client entered / homework2");

        int counter = 0;

        while(true){
            model.addAttribute("counter", counter);

            //3초마다 +1씩 counter의 값 증가
            Thread.sleep(3000);
            counter++;
            System.out.println(counter);

            return "7th/homework2";
        }
    }
}

//timer.schedule()을 사용.
//schedule(TimerTask task, Date firstTime, long period)
//지정한 시간(firstTime) 부터 일정 간격(period)으로 지정한 작업(task)을 수행한다.
//0, 3초, couter++
/*

 */