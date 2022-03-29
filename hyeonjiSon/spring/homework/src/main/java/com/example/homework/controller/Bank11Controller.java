package com.example.homework.controller;

import com.example.homework.entity.order10th.Market;
import com.example.homework.entity.order11th.Member;
import com.example.homework.service.order11th.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/11th/member")
public class Bank11Controller {

    @Autowired
    private MemberService memberService;
    //회원관리 게시판 서비스들을 관리해줄 멤버서비스와 Autowired해준다.

    //회원가입
    @GetMapping("/join")
    public String joinForm(Member member){
        log.info("join");

        return"/11th/member/join";
    }

    @PostMapping("/join")
    public String join(Member member, Model model){
        log.info("DB join = member 정보: " + member);

        memberService.join(member);

        return"/11th/member/success";
    }

    @GetMapping("/login")
    public String loginForm (Member member) {
        log.info("loginForm()");

        return "/11th/member/login";
    }

    @PostMapping("/login")
    public String login (Member member, Model model) {
        log.info("login: " + member);

        System.out.println("Login res: " + memberService.login(member));

        return "/11th/member/success";
    }

    @GetMapping("/list")
    public String list(Model model){
        log.info("list");

        model.addAttribute("list", memberService.list());

        return "/11th/member/list";
    }


    @GetMapping("/read")
    public String read(int memberNo, Model model){
        log.info("read");

        model.addAttribute(memberService.read(memberNo));

        return "/11th/member/read";
    }

    @GetMapping("/modify")
    public String modifyForm(int memberNo, Model model){
        log.info("modifyForm");

        model.addAttribute(memberService.read(memberNo));

        return "/11th/member/modify";
    }

    @PostMapping("/modify")
    public String modify(Member member, Model model){
        log.info("modify");

        //DB에 내용을 갱신
        memberService.modify(member);

        return "/11th/member/success";
    }

    //삭제는 DB에서 이루어지고, 별도로 사용자가 확인해야하는 페이지가 없음
    //Post로 작업하고 success 메세지가 뜨도록 만들어준다.
    @PostMapping("/remove")
    public String remove(int memberNo, Model model){
        log.info("remove");

        memberService.remove(memberNo);

        return "/11th/member/success";
    }
}


//문제은행 [11] 회원 관리 게시판을 만들어보자.
//만들어야하는 기능
//회원 가입
//로그인
//회원 리스트
//회원 상세 정보 보기(본문 읽기)
//회원 정보 수정
//회원탈퇴