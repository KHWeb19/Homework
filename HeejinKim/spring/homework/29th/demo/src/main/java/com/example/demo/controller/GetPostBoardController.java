package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/29th/board")
public class GetPostBoardController {

    @GetMapping("/main")
    public String boardMain(){
        log.info("boardMain()");
        return "29th/main";

    }

}
