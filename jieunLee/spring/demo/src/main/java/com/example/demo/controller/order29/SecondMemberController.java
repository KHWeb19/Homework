package com.example.demo.controller.order29;

import com.example.demo.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
// Contorlloer - 실제 html로 페이지를 넘겨줘야할 경우 활용
//               몇개의 데이터 전송이 필요할때 ResponseBody를 사용
// RestContoroller - 데이터 전송이 많은 경우 활용
//                   ResponseBody가 없어도 json 처리가능
@RestController
@RequestMapping("/29th/member-rest")
public class SecondMemberController {

    // ResponseBody: 웹상에서 객체를 Json 형태로 출력되도록 지원해줌
    // @ResponseBody
    @GetMapping("/view-info")
    public Member viewInfo () {
        log.info("viewInfo check");

        Member member = new Member();

        return member;
    }

    @GetMapping("/view-list")
    public List<Member> viewMemberList () {
        log.info("viewMemberList check");

        List<Member> list = new ArrayList<>();
        for (int i=0; i<3; i++) {
            Member member = new Member();
            list.add(member);
        }

        return list;
    }

    @GetMapping("/view-map")
    public Map<String, Member> viewMemberMapInfo () {
        log.info("viewMemberMap check");

        Map<String, Member> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            Member member = new Member();
            map.put("key" + i, member);
        }

        return map;
    }

    // 리턴이 없는 url을 요청할 경우 Void로 처
    @GetMapping("/returnVoid")
    public Void returnVoid () {
        log.info("returnVoid check");

        return null;
    }

    @GetMapping("/returnBoolean")
    public Boolean returnBoolean () {
        log.info("returnBoolean check");

        return true;
    }
}
