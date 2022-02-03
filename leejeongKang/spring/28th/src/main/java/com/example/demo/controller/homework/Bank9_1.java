package com.example.demo.controller.homework;

import com.example.demo.utility.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@Controller
@RequestMapping("homework1")
public class Bank9_1 {

    @GetMapping("/main")
    public String boardMain() {
        log.info("boardMain()");

        return "homework1/main";
    }

    @ResponseBody
    @PostMapping("/todayProductPost")
    public int todayProductPost(Model model) {
        Product product = new Product();
        log.info("todayProductPost()");
        //model.addAttribute("product", product.productName);
        //model.addAttribute("price", product.priceRandom());

        //return "homework1/todayProductPost";
        return product.priceRandom();
    }

}