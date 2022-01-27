package com.example.bank.controller;

import com.example.bank.utility.Sequence;
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
        Sequence sequence = new Sequence(11);

        model.addAttribute("result", sequence.initSeq());
        return "bank8/homework81";
    }

    @RequestMapping("/homework82")
    public String homework82() {
        return "bank8/homework2";
    }
}
