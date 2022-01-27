package com.example.bank.controller;

import com.example.bank.utility.Sequence;
import com.example.bank.utility.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8Controller {
    private final static Logger logger =
            LoggerFactory.getLogger(Bank8Controller.class);

    @RequestMapping("/homework81")
    public String homework81(Model model) {
        logger.info(" 8-1 check");

        Sequence sequence = new Sequence(31);
        model.addAttribute("result", sequence.initSeq());
        return "bank8/homework1";
    }

    @RequestMapping("/homework82")
    public String homework82(Model model) {
        logger.info(" 8-2 check");

        Student std = new Student();
        std.initAverage();
        model.addAttribute("average", std.getAverage());
        return "bank8/homework2";
    }
}
