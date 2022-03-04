package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("29th/board/second")
public class PathVariableBoard {

    @RequestMapping("/register")
    public String register (){
        log.info("register");//힌글로 써주면 깨져서 나옴

        return "29th/register";
    }

    @RequestMapping("/modify")
    public String modify (){
        log.info("modify");

        return "29th/modify";
    }

    @RequestMapping("/list")
    public String list (){
        log.info("list");

        return "29th/list";
    }


    @RequestMapping("/read/{boardNo}") // 숫자를 입력해서 나타냄 //번호를 읽어서 처리가 가능//처리하는 번호는 달라지지만 처리하는 로직은 같음
    //커뮤니티의 게시판들을 수십만개의 게시글들을 처리할수 있음
    public String read (@PathVariable("boardNo") int boardNo){
        log.info("read: "+ boardNo);

        return "29th/read";
    }

}
