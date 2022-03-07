package com.example.demo.controller.Bank12;

import com.example.demo.entity.ScoreAver;
import com.example.demo.service.ScoreAverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/Bank12")
public class Bank12Controller {


@Autowired
private ScoreAverService scoreaverservice;

    @GetMapping("/register")

    public String registerForm (ScoreAver scoreaver) {

        log.info("registerForm");


        return "/27th/Bank12/register";
    }


    @PostMapping("/register")
    public String register (ScoreAver scoreaver, Model model) {
        log.info("DB register - score 정보: " + scoreaver);


        scoreaverservice.register(scoreaver);


        return "/27th/Bank12/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");


        model.addAttribute("list", scoreaverservice.list());


        return "/27th/Bank12/list";
    }


    @GetMapping("/read")
    public String read (int scoreNo, Model model) {
        log.info("read");


        model.addAttribute(scoreaverservice.read(scoreNo));

        return "/27th/Bank12/read";
    }

    // 33th
    // read에서 수정하기 눌렀을 경우 연동
    @GetMapping("/modify")
    public String modifyForm (int scoreNo, Model model) {
        log.info("modifyForm");

        // 현재 작성된 내용 연동 (데이터)
        model.addAttribute(scoreaverservice.read(scoreNo));

        // 수정 페이지 HTML (화면)
        return "/27th/Bank12/modify";
    }

    // 33th
    // modify HTML 페이지에서 수정하기 눌렀을 경우
    @PostMapping("/modify")
    public String modify (ScoreAver scoreaver, Model model) {
        log.info("modify");

        // DB에 내용 갱신
        scoreaverservice.modify(scoreaver);

        // 성공 메시지 출력
        return "/27th/Bank12/success";
    }

    // 33th
    // 삭제 눌렀을 경우
    @PostMapping("/remove")
    public String remove (int scoreNo, Model model) {
        log.info("remove");

        // DB에서 내용 삭제
        scoreaverservice.remove(scoreNo);

        // 성공 메시지 출력
        return "/27th/Bank12/success";
    }
}
