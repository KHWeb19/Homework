package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/homework")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class Prob13Bank {

    @Autowired
    private ProductBoardService productBoardService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getVueProductListBoard () {
        log.info("product list");

        return new ResponseEntity<>(productBoardService.list(), HttpStatus.OK);
    }

    @PostMapping("/register") // @RequestBody가 뭐지..?
    public ResponseEntity<Product> postVueProductRegisterBoard(@RequestBody Product productBoard){
        log.info("register product");

        productBoardService.register(productBoard); // 이걸 통해서 db에 저장함.

        return new ResponseEntity<>(productBoard, HttpStatus.OK); // productBoard가 필요한 이유는?
    }

    @GetMapping("/{productNo}")
    public ResponseEntity<Product> getVueProductRead(@PathVariable("productNo") Integer productNo){
        log.info("product Read");

        Product product = productBoardService.read(productNo);
        // 왜 product에 저 값을 넣는가?
        // 읽어온 값을 전달해야하기 때문이다.

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PutMapping("/{productNo}")
    public ResponseEntity<Product> postProductModify(@PathVariable("productNo") Integer productNo, @RequestBody Product product) {
        log.info("product Modify");

        product.setProductNo(productNo);
        productBoardService.modify(product);

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping("/{productNo}")
    public ResponseEntity<Void> deleteProductRemove(@PathVariable("productNo") Integer productNo){
        log.info("product Remove");

        productBoardService.remove(productNo);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
