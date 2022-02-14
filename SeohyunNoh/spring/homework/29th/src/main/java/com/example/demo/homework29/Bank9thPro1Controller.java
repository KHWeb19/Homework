package com.example.demo.homework29;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/29thHw/homework29")
public class Bank9thPro1Controller {

    @GetMapping("/product")

        public String productGet(){
            log.info("productGetForm()");

            return "/29thHw/productGet";
    }
}
