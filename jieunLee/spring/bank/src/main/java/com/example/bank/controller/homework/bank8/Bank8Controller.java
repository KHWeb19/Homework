package com.example.bank.controller.homework.bank8;

import com.example.bank.utility.bank8.Sequence;
import com.example.bank.utility.bank8.Student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/bank8")
public class Bank8Controller {

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        log.info("8-1 check");

        Sequence sequence = new Sequence(31);
        model.addAttribute("result", sequence.initSeq());
        return "/homework/bank8/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2(Model model) {
        log.info("8-2 check");

        Student std = new Student();
        std.initAverage();
        model.addAttribute("average", std.getAverage());
        return "/homework/bank8/homework2";
    }
}
