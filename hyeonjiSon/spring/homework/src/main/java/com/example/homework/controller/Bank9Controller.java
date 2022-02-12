package com.example.homework.controller;

import com.example.homework.entity.order9th.RecommendManager;
import com.example.homework.entity.order9th.ProductNumber;
import com.example.homework.utility.area.BaseCalc;
import com.example.homework.utility.area.PolygonResponse;
import com.example.homework.utility.lottoProb.Lotto;
import com.example.homework.utility.lottoProb.LottoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
//상품 정보는 많은 데이터 전송보다는 실제 HTML페이지를 넘겨줘야 하는 상황이겠지?
//RestController보다는 Controller를 사용하는 편이 좋을 것 같다.
@Controller
@RequestMapping("/9th")
public class Bank9Controller {

    @GetMapping("/prob")
    public String getBank9Prob () {
        log.info("get getBank9Prob()");

        return "9th/prob/prob";
    }

    @ResponseBody
    @PostMapping("/prob1")
    public RecommendManager postBank9Prob1(){
        log.info("post postBank9Prob1()");

        //사용자가 랜덤 추천 상품을 요청
        //상품을 관리하는 ProductManager를 객체화
          // MAX는 추천 상품 갯수

          //public static final int로 상품 품목별로 번호를 매겨준다.
          //0 = CLOTH, 1 = BOOK
        RecommendManager p1 = new RecommendManager(5,2, ProductNumber.CLOTH);
                    //총 Total개의 상품 중에, MAX개의 추천 상품을, 상품 품목의 전역변수 넘버

        return p1;
    }
/*
1. Product 클래스를 만들어보자
  1-1. Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
  1-2. 오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
       오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
  1-3. 추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자!
 */

//일단 GetMapping과 PostMapping 페이지를 만들기 위한 기본적인 내용들 부터 적자.

    @ResponseBody
    @PostMapping("/prob2")
    public LottoResponse postBank9Prob2(){
        log.info("post postBank9Prob2()");

        Lotto lotto = new Lotto(100, 5); //100명 중, 다섯명이 당첨되는 로또
        lotto.raffle();

        LottoResponse lr = new LottoResponse(lotto);

        return lr;
    }

    @ResponseBody
    @PostMapping("/triangle")
    public PolygonResponse triangle() {
        log.info("triangle");

        BaseCalc bc = new BaseCalc(2);
        bc.calcTriangleArea();

        PolygonResponse pr = new PolygonResponse(bc);

        return pr;
    }

    @ResponseBody
    @PostMapping("/rectangle")
    public PolygonResponse rectangle() {
        log.info("rectangle");

        BaseCalc bc = new BaseCalc(2);
        bc.calcSquareArea();

        PolygonResponse pr = new PolygonResponse(bc);

        return pr;
    }

    @ResponseBody
    @PostMapping("/hexagon")
    public PolygonResponse hexagon() {
        log.info("hexagon");

        BaseCalc bc = new BaseCalc(2);
        bc.calcHexagonArea();

        PolygonResponse pr = new PolygonResponse(bc);

        return pr;
    }

}
