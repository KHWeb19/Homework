package com.example.demo.order29;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
/*
    RestController : 데이터 전송이 많은 경우 많이 활용 (@ResponseBody 없이도 JSON처리함)
    Controller : 실제 HTML로 페이지를 넘겨줘야할 경우 많이 활용
 */
@RestController
@RequestMapping("/29th/member-rest")
public class Second29thMemberRestController {

    @GetMapping("/view-info")
    public Member viewInfo(){
        log.info("viewInfo()");

        Member member = new Member();

        log.info("member" + member);

        return member;
    }

    @GetMapping("/member-list")
    public List<Member> viewMemberListInfo(){
        log.info("viewMemberListInfo()");

        List<Member> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            Member member = new Member();
            list.add(member);
        }

        return list;
    }

    @GetMapping("/view-map")
    public Map<String, Member> viewMemberMapInfo(){
        log.info("viewMemberMapInfo()");

        Map<String, Member> map = new HashMap<>();

        for(int i = 0; i < 3; i++){
            Member member = new Member();
            map.put("key" + i, member);
        }

        return map;
    }

    // 그렇다면 리턴값이 없는 경우엔?
    // void로 적는게 아닌 Void로 적으면 됨!
    // Void는 void의 클래스 타입
    @GetMapping("/returnVoid")
    public Void returnVoid(){
        log.info("returnVoid()");

        return null;
    }

    @GetMapping("/returnString")
    public String  returnString(){
        log.info("returnString()");

        // @RestController를 사용할 때
        // String을 넣으면 말그래도 " " 안에 있는 문자열이 출력됨
        // @Controller처럼 " " 안에 있는 html을 소환하는 것이 아님
        return "29th/list";
    }

    @GetMapping("/returnBoolean")
    // boolean의 경우도 그것의 클래스 타입인 Boolean으로 작성
    public Boolean returnBoolean(){
        log.info("returnBoolean()");

        return true;
    }
}


