package com.example.demo.homework26th;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class quizControl {

    public static final Logger Logger = LoggerFactory.getLogger(quizControl.class);

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        Logger.info("client entered /homework1");

        Q1 qo = new Q1();
        qo.sequence();

        model.addAttribute("sequenceNum", qo.getNum());

        return "26th/homework1";
    }
    @RequestMapping("/homework2")
    public String homework2(Model model) {
        Logger.info("client entered /homework2");

        Q2 qt = new Q2();
        qt.school();

        model.addAttribute("schoolavg",qt.getAvg());

        return "26th/homework2";
    }

}
