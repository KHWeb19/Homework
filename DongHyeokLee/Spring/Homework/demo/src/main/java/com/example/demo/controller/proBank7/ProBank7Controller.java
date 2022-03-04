package com.example.demo.controller.proBank7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProBank7Controller {

    private static final Logger logger = LoggerFactory.getLogger(ProBank7Controller.class);
    int test = 0;

    @RequestMapping("/homework1")
    public String homework1 (Model model){
        logger.info("client entered / roll");

        final int MAX = 6;
        final int MIN = 1;

        int range = MAX - MIN + 1;

        int rollDice = (int) (Math.random() * range + MIN);

        model.addAttribute("diceNum" , rollDice);

        return "7th/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2 (Model model) throws InterruptedException {
        logger.info("client entered / addThree");

        //3초마다 test라는 변수의 값을 1씩 증가시키도록 한다.
        //3초 마다라... Thread.sleep?
        //값이 실시간으로 팍팍 올라가면 좋겠는데
        //어떻게 하지??
        //계속 뻉뻉 돌고있다가
        //사이트에접속하면 return되어서 값이 출력 되는 느낌인가??
        //변수를 클래스에서 static으로 초기화하니깐 새로고침 할때마다 값이 1씩 올라가고있음
        //근데 이 느낌은 아닌것 같음
        //인텔리제이에서 구동을 시키고
        //url을 요청하면 그때부터 3초마다 test의 값이 1씩올라가고 있음
        //만약에 처음에 url요청해서 값이 나오고 다시 6초뒤 새로고침했다치면 그때는 값이 2가 올라가있어야하는 이런 느낌인거 같음

        while (true) {

            //3000에서 3으로 낮추니깐 새로고침할때 엄청빨라짐
            //무한루프를 도느것이아니라 딱 한번 작동하고 그 값이
            //test에 저장되고 다시 새로고침하면 값이 나오느것 같음 그리고
            // 다시 새로고침할때 sleep이 발동 되는 느낌임
            //300000으로 올리니깐 새로고침이 엄청 늦게 됌
            //그럼 결국 while문이 안 돌아가는 느낌임

            //복구됐다
            test += 1;

            Thread.sleep(3000);


            model.addAttribute("addThree", test);

            return "7th/homework2";
        }

    }
}
