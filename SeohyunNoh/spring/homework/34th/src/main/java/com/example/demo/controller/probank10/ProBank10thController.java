package com.example.demo.controller.probank10;

import com.example.demo.entity.probank10.Product;
import com.example.demo.service.probank10.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/pro-bank10th/product")
public class ProBank10thController {

    @Autowired
    private ProductService productService;

    @GetMapping("/first")
    public String first(Model model){
        log.info("first");

        return "/pro-bank10th/product/first";
    }

    @GetMapping("/login")
    public String login(Model model){
        log.info("login");

        return "/pro-bank10th/product/login";
    }



    @GetMapping("/register")
    public String registerForm(Product product){
        log.info("registerForm");

        return "/pro-bank10th/product/register";
    }

    @PostMapping("/register")
    public String register(Product product, Model model){
        log.info("DB register - product정보" + product);

        productService.register(product);

        return "/pro-bank10th/product/success";
    }

    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        return "/pro-bank10th/product/list";
    }

    @GetMapping("/read")
    public String read (int boardNo, Model model){
        log.info("read");

        model.addAttribute(productService.read(boardNo));
        return "/pro-bank10th/product/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model){
        log.info("modifyForm");

        model.addAttribute(productService.read(boardNo));
        return "/pro-bank10th/product/modify";
    }

    @PostMapping("/modify")
    public String modify (Product product, Model model){
        log.info("modify");

        productService.modify(product);

        return "/pro-bank10th/product/success";
    }

    @PostMapping("/remove")
    public String remove (int boardNo, Model model){
        log.info("remove");

        productService.remove(boardNo);

        return "/pro-bank10th/product/success";
    }
}
