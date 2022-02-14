package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/product")
public class pro10Controller {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String list(Model model){
        log.info("list");

        model.addAttribute("list", productService.list());

        return "/product/list";
    }

    @GetMapping("/register")
    public String registerForm(Product product){
        log.info("registerForm()");

        return "/product/register";
    }

    @PostMapping("/register")
    public String register(Product product){
        log.info("register()");
        productService.register(product);
        return "/product/success";
    }

    @GetMapping("/read")
    public String read(int productNo, Model model){
        log.info("read()");

        model.addAttribute(productService.read(productNo));
        return "/product/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int productNo, Model model) {
        log.info("modifyForm");

        model.addAttribute(productService.read(productNo));

        return "/product/modify";
    }

    @PostMapping("/modify")
    public String modify (Product product) {
        log.info("modify");

        productService.modify(product);

        return "/product/success";
    }

    @PostMapping("/remove")
    public String remove (int productNo) {
        log.info("remove");

        productService.remove(productNo);

        return "/product/success";
    }
}
