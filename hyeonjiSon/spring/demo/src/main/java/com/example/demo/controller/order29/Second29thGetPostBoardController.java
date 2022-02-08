package com.example.demo.controller.order29;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/29th/board")
public class Second29thGetPostBoardController {

    @GetMapping("/main")
    public String boardMain(){
        log.info("boardMain");

        return "29th/board/main";
    }

    //웹상에서 데이터 통신을 하는 방법 2개 = Get, Post
             //Request는 디폴트로 Get을 처리하긴 하지만 가능한 Get을 쓰는 편이 좋다.

    //Get을 사용해서 정보를 요청하면 URL에 정보가 노출됨
    //GetMapping은 사용자가 요청하는 URL을 가져오니까.
    @GetMapping("/registerGet")
    public String registerGet(){
        log.info("registerGetForm");

        return "29th/board/registerGet";
    }

    //Post를 사용하면 URL에 정보가 노출되지 않는다.
    //PostMapping은 URL 요청이 불가하다.
    @PostMapping("/registerPost")
    public String registerPost(){
        log.info("registerPost");

        return "29th/board/registerPost";
    }

    @GetMapping("/modifyGet")
    public String modifyGet(){
        log.info("modifyGetForm");

        return "29th/board/modifyGet";
    }

    @PostMapping("/modifyPost")
    public String modifyPost(){
        log.info("modifyPost");

        return "29th/board/modifyPost";
    }

}
