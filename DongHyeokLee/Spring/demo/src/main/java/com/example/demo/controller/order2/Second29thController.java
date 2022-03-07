package com.example.demo.controller.order2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/29th/board")
public class Second29thController {


    @RequestMapping("/register")
    public String register () {
        log.info("register");

        return "29th/board/register";
    }

    @RequestMapping("/modify")
    public String modify () {
        log.info("modify");

        return "29th/board/modify";
    }

    @RequestMapping("/list")
    public String list () {
        log.info("list");

        return "29th/board/list";
    }

    @RequestMapping("/read/{boardNo}")
    public String read (@PathVariable("boardNo") int boardNo) {
        log.info("read: " + boardNo);

        return "29th/read";
    }

    @RequestMapping("/problem")
    public String problem () {
        log.info("problem");

        return "29th/board/problem";
    }

    @RequestMapping("/insert.no")
    public String insert () {
        log.info("insert.so");

        return "29th/board/insert.no";
    }





}
