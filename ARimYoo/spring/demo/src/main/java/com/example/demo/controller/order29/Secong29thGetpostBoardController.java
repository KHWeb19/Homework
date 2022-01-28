package com.example.demo.controller.order29;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/29th/board")
public class Secong29thGetpostBoardController {

    // GetMapping을 배우기 전에는 RequestMapping으로 URL을 할당했으나 이제는 GetMapping을 쓰도록 하자
    // Get과 Post는 각각 public, private와 유사하며 메서드 안에서만 사용
    // (웹상에서 데이터를 송신하는 방식)

    // Get을 사용해서 정보를 요청하면 URL에 정보가 노출됨
    @GetMapping("/main")
    public String main (){
        log.info("main");

        return "29th/board/main";
    }

    @GetMapping("/registerGet")
    public String registerGet () {
        log.info("registerGetForm()");

        return "29th/board/registerGet";
    }

    // Post를 사용하면 URL에 정보가 노출되지 않음
    @PostMapping("/registerPost")
    public String registerPost () {
        log.info("registerPost()");

        return "29th/board/registerPost";
    }

    @GetMapping("/modifyGet")
    public String modifyGet () {
        log.info("modifyGet()");

        return "29th/board/modifyGet";
    }

    @PostMapping("/modifyPost")
    public String modifyPost () {
        log.info("modifyPost");

        return "29th/board/modifyPost";
    }

    @GetMapping("/list")
    public String listGet () {
        log.info("listGetForm()");

        return "29th/board/listGet";
    }

    @GetMapping("/read/{boardNo}")
    public String readGet (@PathVariable("boardNo") int boardNo) {
        log.info("readGet(): " + boardNo);

        return "29th/board/readGet";
    }

    @PostMapping("/removePost")
    public String removePost () {
        log.info("removePost()");

        return "29th/board/removePost";
    }

}
