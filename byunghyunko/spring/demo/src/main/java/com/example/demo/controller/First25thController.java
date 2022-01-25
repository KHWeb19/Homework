package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller // 주소 입력을 처리하는 곳
public class First25thController {

    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    @RequestMapping("/") // 디폴트
    public String home (Model model) {
        logger.info("client entered / (home)");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        String formattedDate = dateFormat.format(date);
        model.addAttribute("servTime",formattedDate);

        return "home";
    }
}
