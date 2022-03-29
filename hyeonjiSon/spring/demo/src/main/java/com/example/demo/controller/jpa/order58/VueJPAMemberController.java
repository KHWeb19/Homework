package com.example.demo.controller.jpa.order58;

import com.example.demo.entity.jpa.VueJpaMember;
import com.example.demo.service.jpa.order58.VueJpaMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/vueJpaMemberShj")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueJPAMemberController {

    @Autowired
    private VueJpaMemberService service; //오토와이어로 연결되어있다.
    /* Autowired 란?
      -  알아서 의존 객체(Bean) 를 찾아서 주입한다. (Spring의 의존성이란: 하나의 객체 내에서 필요에 의해 다른 객체를 사용해야 할 경우, 사용하는 것)
        VueJPAMemberController 클래스는 항상 service 객체를 사용(의존)한다 고 볼 수 있다.
  -  의존 객체(Bean) 가 2개 이상이면 오류를 발생시킨다.
  -  보통, 인터페이스 선언 시 사용된다.
     */

    @PostMapping("/register") //register를 요청한다.
    public VueJpaMember register (@Validated @RequestBody VueJpaMember member) { //VueJpaMember클래스 형태의 register메서드가 실행된다.
                              //@Validated 는 유효성을 검증해주는 어노테이션이다.
                                   //클래스 레벨에 선언하면 해당 클래스에 유효성 검증을 위한 인터셉터(MethodValidationInterceptor)가 등록된다.
                                   //@Validated를 사용하면 컨트롤러, 서비스, 레포지토리 등 계층에 무관하게 스프링 빈이라면 유효성 검증을 진행할 수 있다.
                              //@RequestBody 는 요청 본문이라는 의미(응답 본문은 ResponseBody)
                                   //클라이언트에서 서버로 요청 메세지를 보낼 때, 본문에 데이터를 담아서 보내야한다. 이것이 요청 본문이다.
                                   //register의 경우 회원 가입을 위한 정보가 본문에 담긴 데이터(요청 본문)인 셈이다.
                              //@ResponseBody 는 서버에서 클라이언트로 응답을 보내는, 본문에 데이터를 담아서 보내는 상황에 사용한다.
        log.info("register request from vue: " + member); //log info에 " " + member가 출력

        service.register(member);

        return member; //member값을 return한다.
    }
}
