package com.example.demo.controller.vue.order48;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/48th/vueboard")
public class Eighteenth48VueBoardController {

    @Autowired
    private BoardService service;

    @ResponseBody
    @GetMapping("/list")
    public List<Board> getVueBoardList () {
        log.info("getVueBoardList()");

        return service.list();
    }
}
