package com.example.bank.controller.bank9;

import com.example.bank.entity.bank9.Product;
import com.example.bank.entity.bank9.ViewRandomProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/bank9")
public class Hw1Controller {

    @GetMapping("/homework1")
    public String homework1 (Model model) {
        log.info("homework1 check");

        return "bank9/homework1";
    }

    @ResponseBody
    @PostMapping("/view-randProduct")
    public ViewRandomProduct viewRandomProduct () {
        log.info("viewRandProduct check");

        Product pro = new Product();
        pro.putProduct();
        pro.randProduct();
        ViewRandomProduct rPro = new ViewRandomProduct(pro.getRandPro());
        return rPro;
    }
}
