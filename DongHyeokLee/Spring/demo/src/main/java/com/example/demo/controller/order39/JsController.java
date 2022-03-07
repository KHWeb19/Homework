package com.example.demo.controller.order39;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/39th/js")
public class JsController {

    @GetMapping("/jsBool")
    public String jsBool() {
        log.info("jsBool");

        return "/39th/js/jsBool";
    }
    @GetMapping("/equalTest")
    public String equalTest() {
        log.info("equalTest");

        return "/39th/js/equalTest";
    }

    @GetMapping("/spread")
    public String spreadTest() {
        log.info("spreadTest");

        return "/39th/js/spread";
    }

    @GetMapping("/classTest")
    public String classTest() {
        log.info("classTest");

        return "/39th/js/classTest";
    }
    @GetMapping("/akmu")
    public String akmu() {
        log.info("akmu");

        return "/39th/js/akmu";
    }
}
