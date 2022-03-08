package Controller;

import entity.ProductBoard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.productService;

import java.util.List;

@Controller
@RequestMapping("/product/board")
@Slf4j
@CrossOrigin(origins = "localhost:8080",allowedHeaders = "*")
public class ProductController {
    @Autowired
    private productService service;
    @GetMapping("/list")

            public List<ProductBoard>getVueProductList(){
   //public ResponseEntity<List<ProductBoard>> getVueProductlist() {
        log.info("getVueProductList()");

            return service.list();
       // return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
}
