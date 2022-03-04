package com.example.demo.controller.proBank10;


import com.example.demo.entity.proBank10.Product;
import com.example.demo.service.proBank10.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/10th/product")
public class ProBank10Controller {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public String list(Model model) {
        log.info("list");

        model.addAttribute("list", productService.list());

        return "/10th/product/list";
    }

    @GetMapping("/register")
    public String registerForm(Product product){
            log.info("registerForm");

            return "/10th/product/register";
        }

    @PostMapping("/register")   // 웹페지에서 입력한 정보가 product객체에 들어감
    public String register(Product product, Model model){
            log.info("DB register");

            productService.register(product);

            return "/10th/product/success";


    }

    @GetMapping("/read")
    public String read (int boardNo, Model model){
            log.info("read");

            model.addAttribute(productService.read(boardNo));

            return "/10th/product/read";
    }


    @GetMapping("/modify")
    public String modifyForm (int boardNo, Model model) {
            log.info("modifyForm");

            model.addAttribute(productService.read(boardNo));

            return "/10th/product/modify";
    }


    @PostMapping("/modify")
    public String modifyForm(Product product, Model model){
            log.info("modifyForm");

           productService.modify(product);

            return "/10th/product/success";
    }

    @PostMapping("/remove")
    public String remove (int boardNo, Model model) {
            log.info("remove");

            productService.remove(boardNo);

        return "/10th/product/success";
    }


}
