package com.example.bank.controller.bank10;

import com.example.bank.entity.bank10.ProductBoard;
import com.example.bank.service.bank10.ProductBoardService;
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
public class ProductController {

    @Autowired
    private ProductBoardService productBoardService;

    @GetMapping("/register")
    public String registerForm (ProductBoard productBoard, Model model) {
        log.info("registerForm check");

        return "/bank10/register";
    }

    @PostMapping("/register")
    public String register (ProductBoard productBoard, Model model) {
        log.info("register check");

        productBoardService.register(productBoard);
        return "/bank10/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list check");

        model.addAttribute("list", productBoardService.list());

        return "/bank10/list";
    }

    @GetMapping("/read")
    public String read (int productNo, Model model) {
        log.info("read check");

        model.addAttribute(productBoardService.read(productNo));
        return "/bank10/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int productNo, Model model) {
        log.info("modifyForm check");

        model.addAttribute(productBoardService.read(productNo));
        return "/bank10/modify";
    }

    @PostMapping("modify")
    public String modify (ProductBoard productBoard, Model model) {
        log.info("modify check");

        productBoardService.modify(productBoard);
        return "/bank10/success";
    }

    @PostMapping("/remove")
    public String remove (int productNo, Model model) {
        log.info("remove");

        productBoardService.remove(productNo);
        return "/bank10/success";
    }
}
