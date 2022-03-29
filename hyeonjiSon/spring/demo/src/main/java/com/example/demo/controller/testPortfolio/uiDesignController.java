package com.example.demo.controller.testPortfolio;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/test")
public class uiDesignController {

    @GetMapping("/test6")
    public String test6(){
        log.info("test6");

        return "/testPortfolio/uiDesign";
    }
}
