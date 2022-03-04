package com.example.demo.controller;

import com.example.demo.utillity.product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintStream;
import java.util.HashMap;

@Controller
public class M1Controller {
    private final static Logger logger = LoggerFactory.getLogger(M1Controller.class);
/*
    @GetMapping("/main")
    public String boardMain () {
        logger.info("boardMain()");

        return "product/main";
    }

 */

    @ResponseBody
    @GetMapping("/view-homework1")
    public product homework1(Model model) {
        logger.info("enter/(homework1)");

        //기각안
        //1.일단 [상품]과 [가격]을 array로 만듦
        // 2.각 상품들에게 번호를 쥐어주는 클래스를 생성(3번 작업이 있는데 필요한가?)
        // 3.selectNum메소드를 작성->Math.Random으로 번호를 뽑으면 그 뽑힌 번호에 따라 상품과 가격이 select 되게끔(swich활용)
        //print 내부에서 랜덤으로 값을 택하게한후 return하면 더 쉽게 해결될거 같기에 기각
        //

        //채용안
        //1.[상품]과 [가격]을 array로 만듦
        //2.가격과 상품의 갯수범위에 맞는 random메소드 생성
        //3.return 으로 "상품[랜덤]:가격[랜덤]"로 뽑아냄
        //model.addAttribute();에서 value값을 상품getValue로 설정하면 연동은 가능할것으로 예상

        //오늘의 추천상품 버튼을 만들기 위해 main HTML을 따로 만들어준후 버튼을 생성 -> Bank9M1으로 연동? 하지만 그러면 JSON은 어떻게 시행?
        //post방식으로 연동되면 자동으로 viewer가 켜지는 건가?->에러(주소를 찾을수 없다함)

        //JSON 방식으로 호출해야하기에 @ResponseBody로 묶음
        //return 값에 product 입력 -> 이 또한 에러(This application has no explicit mapping for /error, so you are seeing this as a fallback.)
        // ->"model.addAttribute("getValue", p.getValue());"는 사용안해도 되는것인가?

        //main HTML에서 JSON으로 연동된 Bank9M1를 구현 시키는법을 잘모르겠습니다..
        product p = new product(3);

        //HashMap으로 연동?

  /*      HashMap<String, String> FuritAndPrice = new HashMap<>();
        FuritAndPrice.put(p.getSelectedFruit(),p.getSelectedPrice());
        return FuritAndPrice;
 */

        p.getValue();
        return p;
    }
}
