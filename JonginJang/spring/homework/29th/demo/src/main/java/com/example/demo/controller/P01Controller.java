package com.example.demo.controller;
import com.example.demo.entity.P01.Product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

import static com.example.demo.entity.P01.ProductList.productList;

@Slf4j
@Controller
@RequestMapping("/shop")
public class P01Controller {

    @GetMapping("/main")
    public String shopMain(Model model) {
        log.info("shopMain()");

        model.addAttribute("productList", Arrays.toString(productList));

        return "/shop/main";
    }
    //POST
    @ResponseBody
    @PostMapping("/showSelectedProduct")
    public Product showSelectedProduct(){
        log.info("showSelectedProduct()");

        Product product = new Product();
        product.selectProduct();
        log.info("Product: "+product);

        return product;
    }
    //GET
    /*
    @ResponseBody
    @GetMapping("/showSelectedProduct")
    public String[] showSelectedProduct() {
        log.info("showSelectedProduct()");

        Product product = new Product();
        product.selectProduct();
        log.info("Product: " + product);

        return product.getSelected();
    }
    */
}
