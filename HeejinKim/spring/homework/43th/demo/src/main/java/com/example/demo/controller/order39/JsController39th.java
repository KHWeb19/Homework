package com.example.demo.controller.order39;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/39th/jsPlay")
public class JsController39th {

    //프로토 타입이란 ?
    //메서드의 이름만 보고 이것을 판정할수 있어야함
    //자바스크립트로 논리연산자 참거짓 판정하는 test 코드라는 것을 알수 있어야함
    //String이 리턴이 되고 인자는 없음 --이런것을 판정--js로 가서 다시 프로토타입을 설명하자면

    @GetMapping("/jsBoolTest")
    public String jsBoolTest () {
        log.info("jsBoolTest()");

        return "/39th/jsBoolTest";
    }

}
