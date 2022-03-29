package com.example.demo.controller.proBank13;


import com.example.demo.entity.proBank10.Product;
import com.example.demo.service.proBank10.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/13th/product")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class ProBank13Controller {

    @Autowired
    private ProductService service;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getProductList () {
        log.info("getProductList()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Product> postRegister(@RequestBody Product product) {
        log.info("postRegister()");

        service.register(product);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<Product> getProductRead(
            @PathVariable("boardNo") Integer boardNo) {
        log.info("getProductRead()");

        Product product = service.read(boardNo);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping("/{boardNo}")
    public ResponseEntity<Void> productRemove(
            @PathVariable("boardNo") Integer boardNo) {
        log.info("productRemove()");

        service.remove(boardNo);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<Product>productModify(
            @PathVariable("boardNo") Integer boardNo,
            @RequestBody Product product) {
        log.info("productModify()");

        product.setBoardNo(boardNo);
        service.modify(product);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
