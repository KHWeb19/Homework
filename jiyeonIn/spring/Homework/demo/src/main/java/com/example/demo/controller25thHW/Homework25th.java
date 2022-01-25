package com.example.demo.controller25thHW;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Homework25th extends ThreadManager {

    private static final Logger logger = LoggerFactory.getLogger(Homework25th.class);

    @RequestMapping("/homework1")
    public String homework1(Model model){
        logger.info("client entered/homework1");

        final int MAX = 6;
        final int MIN = 1;
        int range = MAX - MIN +1;
        int random = (int)(Math.random()*range + MIN);

        model.addAttribute("random",random);

        return "25thHW/homework1";
    }



    @RequestMapping("/homework2")
    public String homework2(Model model) throws InterruptedException {
        logger.info("client entered/homework2");
        // plusOne(); & run() & start() 모두 실행했으나 웹 버퍼링.. 이유가 뭘까
        run();

        model.addAttribute("test", test);

        return "25thHW/homework2";
    }

}
