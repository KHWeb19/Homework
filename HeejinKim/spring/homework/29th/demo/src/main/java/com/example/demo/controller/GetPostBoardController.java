package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/29th/board/third")//전체에 걸려있음
public class GetPostBoardController {

    @GetMapping("/main") //get과 post는 메서드에서만 사용
    public String boardMain(){
        log.info("boardMain()");

        return "29th/board/main";
    }

    @GetMapping("/registerGet") //Get을 사용해서 받아오면 값들이 노출된다 //정보 보호를 할수 없음
    public String registerGet(){
        log.info("registerGetForm()");

        return "29th/board/registerGet";
    }

    @PostMapping("/registerPost") //Post를 사용하면 URL에 정보가 노출되지 않음
    public String registerPost(){
        log.info("registerPost()");

        return "29th/board/registerPost";
    }

    @GetMapping("/modifyGet")
    public String modifyGet(){
        log.info("modifyGetForm()");

        return "29th/board/modifyGet";
    }

    @PostMapping ("/modifyPost")
    public String modifyPost () {
        log.info("modifyPost()");

        return "29th/board/modifyPost";
    }

    @GetMapping("/list") //이건 주소 들어갈 때
    public String listGet () {
        log.info("listGetForm()"); //정보를 알려주는 곳

        return "29th/board/listGet";  //페이지 창 을 나타내는 부분을 담당한는 곳
    }

    @GetMapping("read/{boardNo}")
    public String readGet (@PathVariable("boardNo") int boardNo){
        log.info("readGet(): "+boardNo);

        return "29th/board/readGet";
    }

    @PostMapping("/removePost")
    public String removePost () {
        log.info("removePost()");

        return "29th/board/removePost";
    }

}
