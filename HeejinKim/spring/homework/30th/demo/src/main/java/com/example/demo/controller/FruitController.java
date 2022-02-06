package com.example.demo.controller;


import com.example.demo.entity.num1.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/bank9")
public class FruitController {

    @GetMapping("/fruit")
    public String bank9(){

        log.info("get getfruit");

        return "homework/main";
    }

    @ResponseBody
    @PostMapping("/order")
    public Product postFruit(){

        log.info("post postFruit()");
        Product pr = new Product();

        return pr;
    }
}
