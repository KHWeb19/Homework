package com.example.demo.controller;

import com.example.demo.utility.geoSeq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConHomework1 {
    /*
    문제 은행 [ 3 ] 에 있는 1번, 4번을 Spring Boot의 Controller와 연결시켜서 풀어보자!
    1번의 경우엔 URL 맵핑을 "/homework1"

    1. 아래와 같은 등비 수열이 있다.
    1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
    사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
    (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임)

     */

    // 1 자바 클래스 따로 만들기
    // 2 controller에 연결
    // 3 html 작성
    // 4 구동

    private static final Logger logger = LoggerFactory.getLogger(ConHomework1.class);

    @RequestMapping("/homework1")
    public String geo(Model model) {
        logger.info("client entered / geo");

        geoSeq gs = new geoSeq();
        gs.Input();

        model.addAttribute("GeoNum", gs.Input());

        return "26th/Homework1";
    }
}

