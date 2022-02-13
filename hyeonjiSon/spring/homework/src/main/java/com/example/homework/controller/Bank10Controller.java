package com.example.homework.controller;

import com.example.homework.service.order10th.MarketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/10th/market")
public class Bank10Controller {

    @Autowired
    private MarketService marketService;
    //우선 게시판의 서비스들을 관리해줄 마켓 서비스와 Autowired해준다.
      //Autowired는 @Service 혹은 @Repository와 연결되는 형식이다.
      //SpringBoot에서만 사용이 가능하다.


    //다음으로 url요청을 받을 list 페이지를 만들어준다.
    @GetMapping("list")
    public String list(Model model){
        log.info("list");

        //DB에 저장된 데이터를 읽어서 list속성에 설정한다.
        model.addAttribute("list", marketService.list());
             //MarketService에 저장된 list를 value값으로 가져올 것이다.

        return "/10th/market/list";
    }
    //Model객체: HashMap형태를 갖고 있으며 key값과 value값처럼 사용할 수 있다.
    //          addAttribute는 Map의 put과 같은 기능이라,
    //          이를 통해 해당 모델에 원하는 속성과
    //          그것에 대한 값을 주어 데이터를 전달할 수 있다.


}

//문제은행 [10] 상품 게시판을 만들어보자.
//만들어야하는 기능
  //상품 등록
  //상품 삭제
  //상품 리스트
  //상품 수정
  //상품 상세보기(본문 읽기)