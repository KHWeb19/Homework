package com.example.bank.controller.vue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/vue")
public class VueController {

    @GetMapping("rolePlayGame")
    public String getRolePlayGame () {
        log.info("getRolePlayGame()");

        return "/44th/rolePlayGame";
    }
}
