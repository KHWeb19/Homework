package com.example.demo.controller49th;

import com.example.demo.entity.order34.ProductList;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.PropertyOrFieldReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/register")
    public ResponseEntity<ProductList> postRegisterProduct(@RequestBody ProductList productList) {
        log.info("postRegisterProduct()");

        productService.register(productList);

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/{board_no}")
    public ResponseEntity<ProductList> getProductRead (
            @PathVariable("board_no") Integer board_no){
        log.info("getProductRead()");

        ProductList productList = productService.read(board_no);

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PutMapping("/{board_no}")
    public ResponseEntity<ProductList> ProductModify (
            @PathVariable("board_no") Integer board_no,
            @RequestBody ProductList productList ) {
        log.info("ProductModify()");

        productList.setBoard_no(board_no);
        productService.modify(productList);

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @DeleteMapping("/{board_no}")
    public ResponseEntity<Void> postProductRemove (
            @PathVariable("board_no") Integer board_no ) {
        log.info("postProductRemove()");

        productService.remove(board_no);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
