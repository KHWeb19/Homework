package com.example.demo.order29;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/29th/board")
@Controller
public class Second29thPathVariableBoardController {

    @RequestMapping("/register")
    public String register(){
        log.info("register");

        return "29th/register";
    }

    @RequestMapping("/modify")
    public String modify(){
        log.info("modify");

        return "29th/modify";
    }

    @RequestMapping("/list")
    public String list(){
        log.info("list");

        return "29th/list";
    }

    @RequestMapping("/read/{boardNo}")
    public String read(@PathVariable ("boardNo") int boardNo){
        // @PathVariable을 통해 특정 페이지를 다룰 수 있음
        log.info("read" + boardNo);

        return "29th/read";
    }
}
