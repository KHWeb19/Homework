package com.example.demo.controller.order2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/29th/pathVariable")
public class PracticePathVariable {

    //name 부분끼리 같아야함
    //타입 부분에 String도 들어가짐
    //영어 치면 영어 출력되나 한글은 꺠져서 나옴
    // 인자 부분 str은 메소드 안에 str
    // 오 이렇게 하니깐 내가 주소치는 단어 그대로 웹페이지에서 출력 됌
    @GetMapping("/read1/{name}")
    public String readGet (@PathVariable("name") String str , Model model) {
                log.info("readGet() :" + str );

                model.addAttribute("str" , str ) ;


                return "29th/board/readGet";
    }

    //post는 utl을 입력해도 웹에서 페이지가 안뜨고 오류발생

    @PostMapping("/read2/{name}")
    public String readPost (@PathVariable("name") String str , Model model) {
        log.info("readGet() :" + str );

        model.addAttribute("str" , str ) ;


        return "29th/board/readGet";
    }


}
