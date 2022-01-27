package com.example.demo.homework25th;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homework {
    private static final Logger logger = LoggerFactory.getLogger(Homework.class);

    @RequestMapping("/homework1")
    public String test(Model model) {
        logger.info("client entered /dice");

        int num = (int) (Math.random() * 6) +1;

        model.addAttribute("number", num);

        return "25th/dice";
    }



    /* @RequestMapping("/homework2")
    public static String main(String []args) {
        Plus myplus = Plus.getDefaultPlus();
        for(int i )


        return "25th/homework2";
    } 
     */
}
