package com.example.homework.controller;

import com.example.homework.entity.order10th.Market;
import com.example.homework.service.order10th.MarketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    // 33th
    // 사용자 URL 요청을 받음
    // list 페이지에서 글쓰기를 눌러도 연동됨
    @GetMapping("/register")
    public String registerForm(Market market){
        log.info("registerForm");

        return"/10th/market/register";
    }
    //예를 들어 회원가입을 한 사람만 글쓰기가 가능하도록 하고 싶다.
    //그럼 글쓰기 버튼도 로그인 한 회원에게만 보여야 하는데
    //그런 경우엔 이것도 PostMapping으로 만드는 걸까?

    //DB연동을 위한 작업
    //HTML페이지에서 글쓰기 버튼을 클릭하면 PostMapping으로 연동
    @PostMapping("/register")
    public String register (Market market, Model model){
        log.info("DB register = market 정보: " + market);

        //DB처리
        marketService.register(market);

        //DB처리에 성공하면
        //성공 메시지가 뜨는 페이지를 보여줌
        return"/10th/market/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        model.addAttribute("list", marketService.list());

        return "/10th/market/list";
    }

    //list에서 제목을 눌러서 본문을 읽기 위한 연동
    // 읽기는 사용자가 Url을 요청할 수 있어야하니까 Get
    @GetMapping("/read")
    public String read(int productNo, Model model){
        log.info("read");

        //MarketService에 저장된 productNo번호에 맞는 데이터를 읽는다.
        model.addAttribute(marketService.read(productNo));

        return "/10th/market/read";
    }

    //수정하기는 글쓰기 처럼 사용자가 url을 요청할 수 있는 페이지 1개(Get)
    //그리고 동시에 DB 작업을 처리해줄 (Post) Mapping도 한 개 필요하다.
    @GetMapping("/modify")
    public String modifyForm(int productNo, Model model){
        log.info("modifyForm");

        model.addAttribute(marketService.read(productNo));

        return "/10th/market/modify";
    }

    @PostMapping("/modify")
    public String modify(Market market, Model model){
        log.info("modify");

        //DB에 내용을 갱신
        marketService.modify(market);

        return "/10th/market/success";
    }

    //삭제는 DB에서 이루어지고, 별도로 사용자가 확인해야하는 페이지가 없음
    //Post로 작업하고 success 메세지가 뜨도록 만들어준다.
    @PostMapping("/remove")
    public String remove(int productNo, Model model){
        log.info("remove");

        marketService.remove(productNo);

        return "/10th/market/success";
    }

}

//문제은행 [10] 상품 게시판을 만들어보자.
//만들어야하는 기능
  //상품 등록
  //상품 삭제
  //상품 리스트
  //상품 수정
  //상품 상세보기(본문 읽기)