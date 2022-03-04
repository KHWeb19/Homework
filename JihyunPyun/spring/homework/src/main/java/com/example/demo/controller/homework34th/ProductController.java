package com.example.demo.controller.homework34th;

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
@RequestMapping("/34th")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/register")
    public String registerForm (Product product){
        log.info("registerForm");
        return "/34th/register";
    }

    @PostMapping("/register")
    public String register (Product product){
        log.info("DB register - 정보: " + product);
        productService.register(product);
        return "/34th/success";
    }

    @GetMapping("/modify")
    public String modifyForm (int board_no, Model model){
        log.info("modifyForm");
        model.addAttribute(productService.read(board_no));
        return "/34th/modify";
    }

    @PostMapping("/modify")
    public String modify (Product product, Model model){
        log.info("modify");
        productService.modify(product);
        return "/34th/success";
    }

    @GetMapping("/list")
    public String list (Model model){
        log.info("list");
        model.addAttribute("list",productService.list());
        return "/34th/list";
    }

    @GetMapping("/read")
    public String read (int board_no, Model model){
        log.info("read");
        model.addAttribute(productService.read(board_no));
        return "/34th/read";
    }

    @PostMapping("/delete")
    public String delete (int board_no, Model model){
        log.info("delete");
        productService.delete(board_no);
        return "/34th/success";
    }

}
