package com.example.demo.controller.hw;

import com.example.demo.entity.hw.Member;
import com.example.demo.service.hw.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/hw/signup")
public class SignUpController {

    /*일단 로그인창을 디폴트로 하고
    회원가입창 버튼, 회원 리스트 버튼 생성
    회원가입 후 성공 메세지 & 로그인 하시겠습니까? yes or no 해서 로그인창 되돌아가거나, 기능 구현x
    회원 리스트안에 수정 & 탈퇴 & 상세 정보 보기 통합해서 기능 구현
     */
    @Autowired
    private MemberService memberService;

    //로그인창
    @GetMapping("/login")
    public String loginForm(Member member){
        log.info("longin()");

        return "/hw/signup/login";
    }
    @PostMapping("/login")
    public String login(Member member, Model model){
        log.info("DB login " +member);

        return "/hw/signup/success";
    }
    //회원가입 창
    @GetMapping("/register")
    public String registerForm(Member member) {
        log.info("registerForm()");

        return "/hw/signup/register";
    }
    //회원가입 db
    @PostMapping("/register")
    public String register(Member member, Model model) {
        log.info("DB register "+member);

        memberService.register(member);

        return "/hw/signup/success";
    }
    //회원 리스트
    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        model.addAttribute("list", memberService.list());

        return "/hw/signup/list";
    }
    //상세 정보
    @GetMapping("/read")
    public String read (int memberNo, Model model){
        log.info("read");

        model.addAttribute(memberService.read(memberNo));

        return "/hw/signup/read";
    }
    //수정하기
    @GetMapping("/modify")
    public String modifyForm (int memberNo, Model model){
        log.info("modifyForm");

        model.addAttribute(memberService.read(memberNo));

        return "/hw/signup/modify";
    }
    //수정하기 db
    @PostMapping("/modify")
    public String modify (Member member, Model model){
        log.info("modify");

        memberService.modify(member);

        return "/hw/signup/success";
    }
    //회원 탈퇴
    @PostMapping("/withdrawal")
    public String withdrawal (int memberNo, Model model){
        log.info("withdrawal");

        memberService.withdrawal(memberNo);

        return "/hw/signup/success";
    }
}
