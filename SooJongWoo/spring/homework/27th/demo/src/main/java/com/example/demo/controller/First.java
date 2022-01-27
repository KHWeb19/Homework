package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@Controller
public class First {

    private  static  final Logger logger = LoggerFactory.getLogger(First.class);

    @RequestMapping("/homework1")

   /* 1. 아래와 같은 등비 수열이 있다.
    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
    */
    public String homework1 (Model model) {
        logger.info("client entered /test");

        final int MAX = 31;
        final int START = 0;
        final int BASE =2;

        int[] seq = new int[MAX + 1];

        for (int i = START; i < MAX + 1; i++) {

            seq[i] = (int) Math.pow(BASE, i);

            model.addAttribute("number", seq[i]);
        }
        return "util/homework1";
    }
}
