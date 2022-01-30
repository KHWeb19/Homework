package com.example.demo.controller.order30;


import com.example.demo.utility.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/30th")
public class Bank9Dash30thController {
    /*
    Product 클래스를 만들어보자
    Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
    오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
    오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
    추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자!
     */

    // 1. 상품하나의 가격을 정하는 클래스와 그 상품들을 전시하는 (?) 매장 클래스를 만든다
    // 2. 사용자가 URL을 요청하면 매장에 들어있는 모든 상품정보들이 나오고
    // 3. 오늘의 추천상품을 누르면 랜덤하게 3개의 상품을 골라 POST값으로 전송

    @GetMapping("/product")
    public String main(Model model){

        log.info("store main");

        Product product = new Product();

        model.addAttribute("kindOfGame", product.getGame());

        return "30th/product/main";
    }

    // Post쪽에서 알아서 상품이 들어간다는 의미가 무엇일까 .. ?

    @PostMapping("/product/todayGame")
    public String todayGame () {
        log.info("today Game Recommend");

        return "30th/product/todayGame";
    }

    @ResponseBody
    @GetMapping("")
}
