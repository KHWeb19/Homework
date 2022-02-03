package com.example.demo.controller;

import com.example.demo.utility.prob1.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@Controller
@RequestMapping("/homework1")
public class Pro9BankController_1 {

    //@ResponseBody
    @GetMapping("/main")
    public String PM () {
        log.info("main");

        return "/homework1/main";
    }

    @ResponseBody
    @PostMapping("/todayProduct")
    public Product todayProduct () {
        log.info("todayProduct()");

        Product prd = new Product(5);
        prd.Start();

        return prd;
    }
}

