package com.example.demo.controller.order41th;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/41th/jsArray")
public class Eleventh41thJsArrayController {

    @GetMapping("/usefulAPI")
    public String getUsefulAPI(){
        log.info("getUsefulAPI()");

        return "/41th/jsArray/usefulapi";
    }

    @GetMapping("/repeatAPI")
    public String repeatAPI(){
        log.info("repeatAPI()");

        return "/41th/jsArray/repeatapi";
    }
}
