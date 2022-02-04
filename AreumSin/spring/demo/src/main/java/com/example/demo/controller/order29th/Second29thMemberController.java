package com.example.demo.controller.order29th;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th/member")
public class Second29thMemberController {

    // 주소 요청은 get타입이고 리턴값은 ResponseBaby를 통해 json 데이터 타입으로 보여준다.

    // 실제로는 아래 코드에서 리턴되는 member는 그냥 객체(메모리 주소)일 뿐인데
    // 웹 상에서 출력되는 정보는 JSON 형태로 출력되었다.
    // 이를 지원하는 녀석은 ResposnsBaby에 해당한다.
    // ResponseBaby 역활은 리턴값을 json으로 출력.
    @ResponseBody
    // json 형식으로 파일을 보내준다.
    // toString 과 다름.
    // post는 json을 보는 것이다.
    @GetMapping("/view-info") // 이건 post다 get이 아님 get은 사용자가 검색할 수 없다.

    // ---------------------- 서로 다른 개념임.
    // post로 들어왔을 경우에
    public Member viewInfo () {
        log.info("viewInfo()");

        Member member = new Member();

        return member;
    }
}
