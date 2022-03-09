package com.example.demo.controller49th;

import com.example.demo.entity.order34.ProductList;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/vueproduct")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class bank13 {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResponseEntity<List<ProductList>> getVueProductList () {
        log.info("getVueProductList ()");

        return new ResponseEntity<>(productService.list(), HttpStatus.OK);
    }
}
