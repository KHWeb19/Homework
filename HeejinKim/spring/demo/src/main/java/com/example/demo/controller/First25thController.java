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
    public String home (Model model) {
        logger.info("client entered / (home)");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        String formattedDate = dateFormat.format(date);
        model.addAttribute("servTime", formattedDate);

        return "25th/home";
    }

        @RequestMapping("/test")
        public String test (Model model) {
            logger.info("client entered /test");
//dlfeks일단 땡겨오고 그리고 제가 홈워크 파일을 잘 만들었는지 모르겠어요25th라고 했는데 그게 곗속 지웠다해서 안만들어지네요
            int num =3+7;

            model.addAttribute("number",num);

            return "25th/test";
        }
    }

