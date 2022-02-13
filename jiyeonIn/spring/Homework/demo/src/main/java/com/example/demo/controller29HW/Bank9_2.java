package com.example.demo.controller29HW;

import com.example.demo.entity.order29.lotto.Lotto;
import com.example.demo.entity.order29.response.LottoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/bank9_2")
public class Bank9_2 {
    /*
    문제은행 [ 3 ]의 3번 문제를 여태까지 배운 내용들을 결합하여 풀어보자!
   JSON Viewer 상에서 로또에 당첨된 사람들은 부여받은 번호와 O가 표기되도록 만들어보자!
   당첨되지 않은 사람들은 부여받은 번호와 X가 표기되도록 만든다.

   30명중에 5명이 o표시를 받고, 아머지는 x가 되도록하자. (for문 이용해서 답 도출)
   map으로 key 숫자, value는 문자열로 o,x표시. -> if문으로 5개만 표시됟 수 있도록
     */

    @GetMapping("/main")
    public String lottoMain(){
        log.info("main()");

        return "29thHW/lotto/main";
    }

    @ResponseBody
    @PostMapping("/lotto")
    public LottoResponse lottoInfo(){
        log.info("post lotto");

        Lotto lotto = new Lotto(30,5);
        lotto.calcRandom();
        lotto.findWinner();

        LottoResponse ls = new LottoResponse(lotto);
        return ls;

    }
}
