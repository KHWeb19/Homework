package com.example.demo.controller.vue.order46;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/46th/vue")
public class VueController46th {

    @GetMapping("rpgGame2")
    public String rpgGame2 () {
        log.info("rpgGame2");

        return "/vue/46th/rpgGame2";
    }
}
