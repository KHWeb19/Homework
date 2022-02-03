package com.example.homework.controller;

import com.example.homework.entity.order9.RecommendManager;
import com.example.homework.entity.order9.ProductNumber;
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
@RequestMapping("/9th/product")
public class Bank9Dash1Controller {

    @GetMapping("/main")
    public String boardMain(){
        log.info("boardMain()");

        return "9th/board/main";

    }

    //사용자가 URL을 요청할 수 있는 GetMapping
    //상품의 정보가 들어와 JSON 형태로 정리되도록 하려면 ResponseBody가 필요하다
    //근데 이게 Post쪽에 JSON 형태로 들어오도록 해야 맞는 건가?
    //화면상에 JSON viewer로 출력되게 해야하니까 GetMapping에 하는 게 맞겠지?
    @ResponseBody
    @GetMapping("/productGet")
    public String productGet(){
        log.info("productGet()");

        //사용자가 랜덤 추천 상품을 요청
        //상품을 관리하는 ProductManager를 객체화
          // MAX는 추천 상품 갯수

          //public static final int로 상품 품목별로 번호를 매겨준다.
          //0 = CLOTH, 1 = BOOK
        RecommendManager p1 = new RecommendManager(5,2, ProductNumber.CLOTH);
                    //총 Total개의 상품 중에, MAX개의 추천 상품을, 상품 품목의 전역변수 넘버

        return "9th/board/productViewInfo";
    }

    //URL정보가 노출되지 않는 PostMapping
    @PostMapping("/productPost")
    public String productPost(){
        log.info("productPost()");

        return "9th/board/productPost";
    }

}

/*
1. Product 클래스를 만들어보자

  1-1. Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.

  1-2. 오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
       오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고

  1-3. 추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자!
 */

//일단 GetMapping과 PostMapping 페이지를 만들기 위한 기본적인 내용들 부터 적자.