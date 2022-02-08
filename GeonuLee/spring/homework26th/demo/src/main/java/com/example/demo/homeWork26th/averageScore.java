package com.example.demo.homeWork26th;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class averageScore {

    private final static Logger logger = LoggerFactory.getLogger(averageScore.class);

    @RequestMapping("/homework2")
    public String averageStu(Model model){

        School st = new School();
        st.score();

        model.addAttribute("stu", st.getAvg());

        return "26th/homework2";
    }
}
