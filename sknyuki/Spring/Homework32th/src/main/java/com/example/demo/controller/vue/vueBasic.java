package com.example.demo.controller.vue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/vue")
public class vueBasic {

    @GetMapping("/basic")
    public String basic () {
        log.info("basic");

        return "/27th/Vue/vueBasic";
    }


    @GetMapping("/click")
    public String click(){
        log.info("click");

        return "/27th/Vue/click";
    }

    @GetMapping("/vfor")
    public String vfor(){
        log.info("vfor");

        return "/27th/Vue/vfor";
    }
}

