package com.example.demo.controller.Homework;

import com.example.demo.Homework.HW1.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/homework9/num1")
public class HW1Controller {
    /* Product 클래스를 만들어보자
    Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
    오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
    오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
    추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자! */

    @ResponseBody
    @GetMapping("/main")
    public String HWmain(Model model){
        log.info("HWmain");

        Product pd= new Product();
        pd.randomFruits();
        //랜덤으로 나온 상품을 어떻게 출력할 것인가?

        return "homework/main";
    }




}
