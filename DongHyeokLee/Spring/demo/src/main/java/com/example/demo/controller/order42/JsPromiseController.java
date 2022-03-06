package com.example.demo.controller.order42;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/42th/promise")
public class JsPromiseController {


    @GetMapping("/one")
    public String getPromiseOne() {
            log.info("getPromiseOne");

            return "/42th/promise/one";
    }

    @GetMapping("/two")
    public String getPromiseTwo() {
            log.info("getPromiseTwo");

            return "/42th/promise/two";
    }

    @GetMapping("/three")
    public String getPromiseThree() {
        log.info("getPromiseThree");

        return "/42th/promise/three";
    }

    @GetMapping("/four")
    public String getPromiseFour() {
        log.info("getPromiseFour");

        return "/42th/promise/four";
    }

    @GetMapping("/five")
    public String getPromiseFive() {
        log.info("getPromiseFive");

        return "/42th/promise/five";
    }

    @GetMapping("/six")
    public String getPromiseSix() {
        log.info("getPromiseSix");

        return "/42th/promise/six";
    }
}
