package com.example.demo.controller;

import com.example.demo.utility.Dice;
import com.example.demo.utility.thread.ThreadWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7Dash26thController {
    private final static Logger logger = LoggerFactory.getLogger(Bank7Dash26thController.class);

    @RequestMapping("/homework1")
    public String Homework1(Model model) {
        logger.info("client entered / homework1");

        Dice dice = new Dice();
        dice.rollDice();

        model.addAttribute("diceNum", dice.getDiceNum());
        return "26th/homework1";
    }

    @RequestMapping("/homework2")
    public String Homework2(Model model) {
        logger.info("client entered / homework2");

        // 객체가 main에 있기때문에 접근을 하기 위해서 getSyncLockTest()를 static으로 만들어준다.
        model.addAttribute("threadNum", ThreadWorker.getSyncLockTest());
        // ThreadWorker.getSyncLockTest() 가 Critical Section인 이유는?
        // -> main에서도 Thread로 구현되어있기 때문에 둘다 Thread라서..?

        return "26th/homework2";
    }
}
