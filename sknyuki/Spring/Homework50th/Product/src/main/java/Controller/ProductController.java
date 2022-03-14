package Controller;

import entity.ProductBoard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/{productNo}")
    public ResponseEntity<ProductBoard> getVueBoardRead(
            @PathVariable("boardNo") Integer productNo) {
        log.info("getVueBoardRead()");

        ProductBoard board = service.read(productNo);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }


    @DeleteMapping("/{productNo}")
    public ResponseEntity<Void> vueBoardRemove(
            @PathVariable("productNo") Integer productNo) {
        log.info("vueBoardRemove()");

        service.remove(productNo);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{productNo}")
    public ResponseEntity<ProductBoard> vueBoardModify(
            @PathVariable("productNo") Integer productNo,
            @RequestBody ProductBoard productboard) {
        log.info("vueBoardModify()");

        productboard.setProductNo(productNo);
        service.modify(productboard);

        return new ResponseEntity<>(productboard, HttpStatus.OK);
    }
}
