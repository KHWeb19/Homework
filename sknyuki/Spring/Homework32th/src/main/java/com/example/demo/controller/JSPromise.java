package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("JSPromise")
public class JSPromise {
    @GetMapping("/one")
    public String JSPromise1 () {
        log.info("one");

        return "/27th/promise/JSPromiseOne";
    }


    @GetMapping("/two")
    public String JSPromise2 () {
        log.info("two");

        return "/27th/promise/JSPromiseTwo";
    }

    @GetMapping("/three")
    public String JSPromise3 () {
        log.info("three");

        return "/27th/promise/JSPromiseThree";
    }

    @GetMapping("/four")
    public String JSPromise4 () {
        log.info("four");

        return "/27th/promise/JSPromiseFour";
    }

    @GetMapping("/five")
    public String JSPromise5 () {
        log.info("five");

        return "/27th/promise/JSPromiseFive";
    }


}