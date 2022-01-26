package com.example.demo.homeWork26th;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class Sequence {

    private static final Logger logger = LoggerFactory.getLogger(Sequence.class);

    @RequestMapping("/homework1")
    public String quiz1(Model model) {
        SequenceControl sc = new SequenceControl();
        sc.Control();

        model.addAttribute("num",sc.getNum());


        return "26th/homework1";
    }

}
