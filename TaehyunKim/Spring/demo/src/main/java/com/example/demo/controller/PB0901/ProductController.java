package com.example.demo.controller.PB0901;

import com.example.demo.entity.PB0901.Product;
import com.example.demo.entity.PB0901.ProductManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/PB0901")
public class ProductController {

    @GetMapping("/main")
    public String main(){
        log.info("main");
        return "PB0901/main";
    }

    @ResponseBody
    @PostMapping("productPost")
    public Product todaysProduct(){
        log.info("todaysProduct()");

        ProductManager pm = new ProductManager(10);

        return pm.getTodaysProduct();

    }

}
