package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/homework")
public class VueHomeworkController {

    @GetMapping("/vueEx")
    public String vueEX(){
        log.info("vueEx()");

        return "/homework/vueEx";
    }
}
