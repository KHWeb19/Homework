package com.example.demo.controller34HW;

import com.example.demo.entity.order34.ProductList;
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
@RequestMapping("/bank10")
public class Bank10Product {

    @Autowired
    private ProductService productService;

    @GetMapping("/register")
    public String registerForm(ProductList productList){
        log.info("registerForm");

        return "/34thHW/register";
    }

    @PostMapping("/register")
    public String register(ProductList productList){
        log.info("registerPost");

        productService.register(productList);

        return "/34thHW/success";
    }

    @GetMapping("/list")
    public String list(ProductList productList, Model model){
        log.info("list");

        model.addAttribute("list",productService.list());

        return "/34thHW/list";
    }

    @GetMapping("/read")
    public String read (int board_no,Model model){
        log.info("read");

        model.addAttribute(productService.read(board_no));

        return "/34thHW/read";
    }

    @GetMapping("/modify")
    public String modifyForm(int board_no,Model model){
        log.info("modifyForm");

        model.addAttribute(productService.read(board_no));

        return "/34thHW/modify";
    }

    @PostMapping("/modify")
    public String modify(ProductList productList, Model model){
        log.info("modify");

        productService.modify(productList);

        return "/34thHW/success";
    }

    @PostMapping("/remove")
    public String remove(int board_no, Model model){
        log.info("remove");

        productService.remove(board_no);

        return "/34thHW/success";
    }
}
