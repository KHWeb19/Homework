package com.example.demo.controller.Bank8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8Controller {

    private static final Logger logger = LoggerFactory.getLogger(Bank8Controller.class);

    @RequestMapping("/homework1")
    public String homework1(Model model) {
        logger.info("client entered / (homework1)");

        // 원하는 등비와 항값 입력
        GeometricSequence gs = new GeometricSequence(2,5);
        gs.calcStart();
        model.addAttribute("number",gs.printArr());

        return "26th/homework1";
    }

    @RequestMapping("/homework2")
    public String homework2(Model model) {
        logger.info("client entered / (homework2)");

        StudentScoreManager stu = new StudentScoreManager();
        stu.calcStart();

        model.addAttribute("number",stu.ScoreAvg());

        return "26th/homework2";
    }
}
