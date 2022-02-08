package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(DiceController.class);
    private int i;

    @RequestMapping("/homework2")
    //3초마다 test 라는 변수의 값을 1씩 증가시키도록 한다.
    //또한 /homework2 URL를 요청하면
    //현재의 test 값을 화면에 출력되게 만들어보자.

    //초기 변수는 0으로 설정하자.
    //3초마다 1씩 숫자가 증가를 시키게 해야 하는데...
    //0 ~ 3 까지는 0을 4 ~ 6 까지는 1을 7 ~ 9까지는 2를 url 요청이 오면 출력해야한다.
    // thread 3개를 이용하여 0  ~  1,    1   ~   2,     2   ~   3   을 반복시켜보자.
    // thread는 1개에 1,000번으로 잡자.
    // start 값과 end 값도  0 ~  999, 1,000 ~ 1,999  2,000 ~ 2,999 으로 잡고 반복시킨다.
    // thread가 3,000개 발생하면 + 1이 되도록
    //3개가 0,1,2,0,1,2반복하게 만들고
    //아니 이렇게 할 필요 없이 while(true)구문을 이용해서
    //변수 i++되게 하고 thread sleep를 3,000ms로 지정해서 하면 되지 않을까?


    public String homework2(Model model) throws InterruptedException {
        logger.info("client entered /homework2");

        int testNum = 0;

        while (true) {

            testNum = i++;
            Thread.sleep(3000);
            model.addAttribute("number", testNum);
            return "25th/homework2";
        }
    }
}





