package com.example.bank.controller.order38;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/38th")
public class NonCiVueController {

    @GetMapping("/vue-index")
    public String ncvue () {
        log.info("vue index check");

        return "/38th/index";
    }
}
