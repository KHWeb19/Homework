package com.example.demo.controller;

import com.example.demo.utillity.M1Class;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class M1Controller {
    private final static Logger logger= LoggerFactory.getLogger(M1Controller.class);

    @RequestMapping("/homework1")
    public String homework1 (Model model) {
        logger.info("enter/(homework1)");
        M1Class m1class=new M1Class(2);

        model.addAttribute("getValue", m1class.getValue(31));

        return "27th/M1Html";
    }
}
