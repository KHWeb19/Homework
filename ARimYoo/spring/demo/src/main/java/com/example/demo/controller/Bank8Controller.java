package com.example.demo.controller;

import com.example.demo.utility.GeoSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bank8Controller {

    private static final Logger logger = LoggerFactory.getLogger(Bank8Controller.class);

    // homework1로 하니까 이미 맵핑되어있는 것이 있어서 오류가 납니다.
    @RequestMapping("/homework3")
    public String homework1 (Model model){

        logger.info("client entered / (homework1)");

        GeoSequence sq = new GeoSequence(2);

        model.addAttribute("ratio", GeoSequence.getRatio());
        model.addAttribute("sequence", GeoSequence.allocSequence(31));

        return "27th/homework1";
    }

}
