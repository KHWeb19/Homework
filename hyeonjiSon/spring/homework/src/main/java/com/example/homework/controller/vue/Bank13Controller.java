package com.example.homework.controller.vue;

import com.example.homework.entity.order10th.Market;
import com.example.homework.service.order10th.MarketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/13th/market")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
//CrossOrigin Annotation: 웹 페이지의 제한된 자원을 외부 도메인에서 접근을 허용해주는 매커니즘
//서로 다른 도메인에서 리소스를 공유하는 방식
public class Bank13Controller {

    @Autowired
    private MarketService service;

    @GetMapping("/list")
    public ResponseEntity<List<Market>> getVueMarketList () {
        //<<마켓>의 리스트> 응답을 요청하는 메소드
        log.info("getVueMarketList()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
                         //보드서비스의 리스트, 상태코드.OK를 응답으로 전달
    }
    /*
    ResponseEntity 클래스란?
    - HttpEntity클래스를 상속받아 구현한 클래스이다.
          -HttpEntity란? HTTP 요청(Request), 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스
    - 즉, 응답을 보내는 Entity라는 것이다.
     */

    //마켓 리스트가 잘 뜨는지 확인한 후에 다음 단계를 진행하자.

    //게시글 등록, 읽기, 수정, 제거

    @PostMapping("/register")
    public ResponseEntity<Market> postRegisterBoard (@RequestBody Market market) {
        log.info("postRegisterMarket()");

        service.register(market);

        return new ResponseEntity<>(market, HttpStatus.OK);
    }


    @GetMapping("/{productNo}")
    public ResponseEntity<Market> getVueMarketRead(
            @PathVariable("productNo") Integer productNo) {
        log.info("getVueMarketRead()");

        Market market = service.read(productNo);

        return new ResponseEntity<>(market, HttpStatus.OK);
    }

    @DeleteMapping("/{productNo}")
    public ResponseEntity<Void> vueMarketRemove(
            @PathVariable("productNo") Integer productNo) {
        log.info("vueMarketRemove()");

        service.remove(productNo);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{productNo}")
    public ResponseEntity<Market> vueMarketModify(
            @PathVariable("productNo") Integer productNo,
            @RequestBody Market market) {
        log.info("vueMarketModify()");

        market.setProductNo(productNo);
        service.modify(market);

        return new ResponseEntity<>(market, HttpStatus.OK);
    }
}
