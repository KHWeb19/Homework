package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/34th/html")
public class imageController {

    @GetMapping("/liTag")
    public String liTag () {
        log.info("liTag");

        return "/34th/html/liTag";
    }
}
