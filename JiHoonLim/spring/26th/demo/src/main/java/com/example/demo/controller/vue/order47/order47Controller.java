package com.example.demo.controller.vue.order47;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/47th/rpg")
public class order47Controller {

    @GetMapping("/tactics")
    public String tactics () {
        log.info("tactics()");

        return "/vue/47th/tactics";
    }
}
