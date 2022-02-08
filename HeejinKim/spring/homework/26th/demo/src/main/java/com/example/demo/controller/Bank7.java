package com.example.demo.controller;

import com.example.demo.utility.ThreadWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank7 {
    private final static Logger logger =
                LoggerFactory.getLogger(Bank7.class);


    @RequestMapping("/homework22")//이건 url
    public String bank7(Model model){
    logger.info("homework22");

    model.addAttribute("add",ThreadWorker.getLockTest());

    return "26th/homework7";
    }

}
