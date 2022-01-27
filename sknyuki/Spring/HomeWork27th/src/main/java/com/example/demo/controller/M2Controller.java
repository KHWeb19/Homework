package com.example.demo.controller;

import com.example.demo.utillity.M2Class;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    public class M2Controller {
        private final static Logger logger= LoggerFactory.getLogger(M2Controller.class);

        @RequestMapping("/homework2")
        public String homework2 (Model model) {
            logger.info("enter/(homework2)");
            M2Class m2class=new M2Class(30);

            model.addAttribute("getValue", m2class.getstudendAver());

            return "27th/M2Html";
        }
    }

