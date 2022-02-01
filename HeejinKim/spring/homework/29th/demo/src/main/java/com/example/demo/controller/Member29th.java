package com.example.demo.controller;

import com.example.demo.entity.order29.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/29th/member")
public class Member29th {

    @ResponseBody

    @GetMapping("/view-info")

    //Get요청과  밑에꺼는 별개
    //만약 Post 요청을 하면 밑에 것을 동작하는 것
    //get요청에서도 데이터(return member;)를 보낼수 있음

    public Member viewInfo(){
        log.info("viewInfo()");

        Member member =new Member();
        log.info("member: "+ member);

        //"member"가 toString의 역할을 함
        //이것을 특정 URL에 꽂으면 됨

        return member;

        //여기서 Json형태로 나오는 이유는 ResponseBody를 해서

        //객체화 시킨 정보(member )를 리턴함

        // 화면에 출력 결과는
        // toString의 형태가 아님
        // post로 보내는 데이터의 형식은 문자열로 오게 됨
        // toString이 없는 상태에서는 메모리 주소 값으로 나오게됨
        //    "      있는 상태에서는 문자열로 나오게 됨
        // post 처리하게 되는 것들은 데이터 타입이 전부 Json형식으로 만들어지게 됨
        // post 처리하는 것을 도와주는 것은 responsebody
        // responsebody가 붙으면 리턴하는 객체의 정보를 post 형식으로 (Json형식)으로 바꿔서 보내줌
        // toString은 우리가 보기위해서 출력하기 위한 문자열이고
        // Json형식으로 만들기 위해서 responsebody를 사용하게 됨
        // (Json과 toString의 형식은 다른 것임)
        // ...즉, post는 json을 보게된다
        // Json타입으로 나오면 다 post임
        // Getmapping처리하는 것은 사용자가 URL에 요청하는 것을 처리함
        // postmapping에 걸려있는 것은 사용자가 처리 할 수가 없음(사용자가 URL창으로 요청 할수 가 없음)
        // get에 대한 요청>>>> 그 요청을 처리>>>>>Jso형태로 리턴함

        //웹상에서 데이터를 통신하는 방법 2가지 ( Get/Post )
        //Get으로 데이터를 보내면 값이 노출됨(개인정보를 노출)
        //post방식은 데이터를 보내는 방식이 Json형식...정보통신을 위한 프론트 엔진들과 통신하기 위한 전반적인 작업

    }

}
