package com.example.demo.controller.order39;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/39th/js")
public class order39Controller {

    @GetMapping("/jsBoolTest")
    public String jsBoolTest(){
        log.info("jsBoolTest");

        return "/39th/js/jsBoolTest";
    }

    @GetMapping("/equalTest")
    public String equalTest(){
        log.info("equalTest");

        return "/39th/js/equalTest";
    }

    @GetMapping("/equalTest2")
    public String equalTest2(){
        log.info("equalTest2");

        return "/39th/js/equalTest2";
    }

    @GetMapping("/spreadTest")
    public String spreadTest(){
        log.info("spreadTest");

        return "/39th/js/spreadTest";
    }

    @GetMapping("/classTest")
    public String classTest(){
        log.info("classTest");

        return "/39th/js/classTest";
    }
}
