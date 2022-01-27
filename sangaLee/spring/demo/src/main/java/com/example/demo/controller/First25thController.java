package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class First25thController {

    private static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    @RequestMapping("/")
    public String home(Model model) {
        logger.info("client entered / (home)");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        String formattedDate = dateFormat.format(date);
        model.addAttribute("servTime", formattedDate);

        return "25th/home";
    }



    @RequestMapping("/homework1")
    public String test(Model model) {
        logger.info("client entered /test");

        int num = (int) (Math.random() * 6) +1;

        model.addAttribute("number", num);

        return "25th/test";
    }
}
