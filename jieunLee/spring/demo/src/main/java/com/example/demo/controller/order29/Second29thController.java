package com.example.demo.controller.order29;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
// 지금까지 배운 내용으로는
// 클래스는 리퀘스트 매핑
// 메서드는 겟, 포스트 매핑
@RequestMapping("/29th/board")
public class Second29thController {

    @GetMapping("/main")
    public String boardMain () {
        log.info("boarMain check");
        return "29th/board/main";
    }

    //회원가입 양식과 같이 노출되도 되는 정보는 Get을 사용해서 처리
    @GetMapping("/registerGet")
    public String registerGet () {
        log.info("registerGet check");
        return "29th/board/registerGet";
    }

    //아이디, 비밀번호와 같이 노출되면 안되는 정보는 Post를 사용해서 처리
    @PostMapping ("/registerPost")
    public String registerPost () {
        log.info("registerPost check");
        return "29th/board/registerPost";
    }

    @RequestMapping("/list")
    public String list () {
        log.info("list check");
        return "29th/list";
    }

    @RequestMapping("/read/{boardNo}")
    // 가변 입력 처리
    // 여러 게시글(페이지)에 번호를 붙여 같은 로직으로 확인할수있음
    public String read (@PathVariable("boardNo") int boardNo) {
        log.info("read check: "+boardNo);
        return "29th/read";
    }
}
