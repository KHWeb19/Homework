package com.example.demo.controller;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/29th/member-rest")
public class MemberRest29th {



    //RestController
    // responsbody를 지웠는데도 결과가 동일 제이슨을 만드는 것을 지움 . RestController가 이것을 지원해줌
    //데이터 전송이 많은 경우에 필요함(알아서 Json을 처리함)

    //controller에는 responsbody를 항상 메소드 마다 넣어줌
    //html쪽으로 페이지를 넘겨줄 때 페이지와 데이터를 둘다 넘겨줄 때
    //RestController를 써서 페이지를 핸들링한다고 하면 페이지가 많이 추가가 됨
    //controller만 써서 responsbody를 통해 넘기는 것이 나음

    @GetMapping("/view-info")
    public Member viewInfo(){

        log.info("viewInfo()");

        Member member =new Member();
        log.info("member: "+ member);

        return member;

    }
    @GetMapping("/member-list")//컬렉션 기반의 배열

    //데이터의 배열을 출력하고 싶을때 가능

    public List < Member > viewMemberListInfo(){
        log.info("viewMemberListInfo()");

        List<Member>list =new ArrayList<>();

        for(int i = 0 ; i < 3 ; i++ ){

            Member member = new Member();
            list.add(member);

        }
        return list;
    }

    @GetMapping("/view-map")

    public Map<String, Member > viewMemberMapInfo(){
        log.info("viewMemberMapInfo()");

        Map<String, Member > map = new HashMap<>();

        for(int i = 0 ; i < 3 ; i++ ){

            Member member = new Member();
            map.put("key"+i,member); //밸류가 멤버를 적어놓은 위치

        }
        return map;
    }
//DB에 맵이든 리스트이든 모든 형식을 다 보낼수 있음
//DB의 정보가 Arraylist에 저장되어 있으면 그 정보들을 전달이 가능함
@GetMapping("/returnVoid")
    public Void returnVoid(){

    log.info("returnVoid()");

    return null;
}
    @GetMapping("/returnString")
    public String returnString(){

        log.info("returnString()");

        return "29th/list";
        //문자열로만 나옴
        //String을 넣으면 String이 출력이 됨
        //rest에서 html로 넘기는 방법이 있음.
        //스프링이 클라이언트가 되어야 할 때
        //ex, 파이선에서 요청한 정보를 스프링에서 넘겨줘야할 때
    }
    @GetMapping("/returnBoolean")
    public Boolean returnBoolean() {

        log.info("returnBoolean()");

        return true;
        //Json 타입의 true
        //Json이 기본적으로 String으로 구성이 됨
        //위쪽의 string은 기본적으로 날렸기 때문에 제이슨 형식이 아니므로 그냥 문자열이 출력
        //제이슨 형식으로 true가 날아오면 뷰어가 동작을 함
    }

}
