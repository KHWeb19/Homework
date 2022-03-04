package com.example.demo.controller44HW;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/vue")
public class VueController {

    @GetMapping("/rolePlay")
    public String rolePlay (){
        log.info("rolePlay");

        return "44thHW/rolePlay";
    }
}
