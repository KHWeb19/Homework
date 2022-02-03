package com.example.demo.controller.homework29th;

import com.example.demo.entity.homework29th.Product;
import com.example.demo.entity.homework29th.ProductManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@Controller
@RequestMapping("/29th/product")
public class Hw29thProductController {
    @GetMapping("/main")
    public String main () {
        log.info("main");
        return "29th/product/main";
    }

    @GetMapping("/productGet")
    public String productGet () {
        log.info("productGet()");
        return "29th/product/productGet";
    }

    @PostMapping("/productPost")
    public String productPost () {
        log.info("productPost()");
        return "29th/product/productPost";
    }

    @ResponseBody
    @GetMapping("/view-recommend")
    public ProductManager viewRecommend (){
        log.info("viewRecommend()");
        ProductManager pm = new ProductManager();
        pm.addProduct();
        pm.randomProduct();
        return pm;
    }
}
