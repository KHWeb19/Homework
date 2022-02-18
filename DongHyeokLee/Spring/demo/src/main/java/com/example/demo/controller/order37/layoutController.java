package com.example.demo.controller.order37;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/37th/layout")
public class layoutController {

    @GetMapping("/boxSizing")
    public String boxSizing() {
        log.info("boxSizing");

        return "/37th/layout/boxSizing";
    }

    @GetMapping("/boxPositioning")
    public String boxPositioning() {
        log.info("boxPositioning");

        return "/37th/layout/boxPositioning";
    }

    @GetMapping("/boxPositioning2")
    public String boxPositioning2() {
        log.info("boxPositioning2");

        return "/37th/layout/boxPositioning2";
    }

    @GetMapping("/boxLayout")
    public String boxLayout() {
        log.info("boxLayout");

        return "/37th/layout/boxLayout";
    }

    @GetMapping("/boxBorder")
    public String boxBorder () {
        log.info("boxBorder()");

        return "/37th/layout/boxBorder";
    }

    @GetMapping("/boxBorderRound")
    public String boxBorderRound () {
        log.info("boxBorderRound()");

        return "/37th/layout/boxBorderRound";
    }

    @GetMapping("/boxBorderEllipse")
    public String boxBorderEllipse () {
        log.info("boxBorderEllipse()");

        return "/37th/layout/boxBorderEllipse";
    }

    @GetMapping("/cssElementSelector")
    public String cssElementSelector () {
        log.info("cssElementSelector()");

        return "/37th/layout/cssElementSelector";
    }

    @GetMapping("/cssElementSelector2")
    public String cssElementSelector2 () {
        log.info("cssElementSelector2()");

        return "/37th/layout/cssElementSelector2";
    }

    @GetMapping("/cssElementSelector3")
    public String cssElementSelector3 () {
        log.info("cssElementSelector3()");

        return "/37th/layout/cssElementSelector3";
    }

    @GetMapping("/cssElementSelector4")
    public String cssElementSelector4 () {
        log.info("cssElementSelector4()");

        return "/37th/layout/cssElementSelector4";
    }

    @GetMapping("/cssElementSelector5")
    public String cssElementSelector5 () {
        log.info("cssElementSelector5()");

        return "/37th/layout/cssElementSelector5";
    }
}
