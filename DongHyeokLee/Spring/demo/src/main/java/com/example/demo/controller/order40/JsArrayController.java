package com.example.demo.controller.order40;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/40th/jsArray")
public class JsArrayController {

    @GetMapping("usefulAPI")
    public String usefulAPI () {
        log.info("usefulAPI");

        return "/40th/jsArray/usefulAPI";
    }

    @GetMapping("repeatAPI")
    public String repeatAPI () {
        log.info("repeatAPI");

        return "/40th/jsArray/repeatAPI";
    }
}
