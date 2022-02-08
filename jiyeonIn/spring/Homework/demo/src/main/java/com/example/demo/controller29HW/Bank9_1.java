package com.example.demo.controller29HW;

import com.example.demo.entity.order29.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/bank9_1")
public class Bank9_1 {
    /*
    1. Product 클래스를 만들어보자
   Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
   오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
   오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
   추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자!
     */


    @GetMapping("/main")
    public String bank9main(){
        log.info("Main()");

        return "29thHW/product/product";
    }

    @GetMapping("/recommendProduct")
    public String recommendProduct(){
        log.info("recommendProduct()");

        return "29thHW/product/recommendProduct";
    }

    //PostMapping방법으로 풀어보기
    //해당 매소드에서 JSON으로 변환 할 수 있는 방법이 있을까요?
    @PostMapping("/showProduct")
    public String showProduct(Model model) {
        log.info("showProduct()");

        Product product = new Product();
        product.showName();
        product.showPrice();

        model.addAttribute("name", product.getProName());
        model.addAttribute("price", product.getProductPrice());

        return "29thHW/product/showProduct";
    }

    //map방법으로 풀어보기
    // 오늘의 추천상품을 누르면 post가 알아서 상품이 들어간다는게 이해가 되지 않습니다.
    @ResponseBody
    @GetMapping ("/showMapProduct")
    public Map<String, Integer> showMapProduct(){
        log.info("showMapProduct()");

        Map<String, Integer> map = new HashMap<>();

        Product product = new Product();
        map.put(product.showName(),product.showPrice());

        return map;

    }


}
