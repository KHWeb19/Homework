package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homework2 extends Thread{
    private static final Logger logger = LoggerFactory.getLogger(Homework2.class);

    @RequestMapping("/homework2")
    public String test2(Model model) {
        logger.info("client entered/ (homework2)");

        int test = 0;

        for(int i = 0; i < 10; i++){
            test = i;
            System.out.println(test);
       
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
            }
        }
        model.addAttribute("testiest", test);
        return "25th/homework2";
    }
}

