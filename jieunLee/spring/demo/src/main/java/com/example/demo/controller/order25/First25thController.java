package com.example.demo.controller.order25;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

// 서버의 컨트롤러
// 클라이언트가 url요청한것을 처리해줌
// "/" -> "25th/home"
@Controller
public class First25thController {
    private  static final Logger logger = LoggerFactory.getLogger(First25thController.class);

    @RequestMapping("/")
    public String home (Model model) {
        //Logger(로거): 상태값(메시지)을 기록으로 남김
        //메시지를 띄워서 해당 요청이 잘 들어왔는지 확인
        logger.info("client entered / (home)");

        //날짜를 구해옴
        Date date = new Date();
        //숫자형식으로 가져옴
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        //문자열로 변경
        String fomattedDate = dateFormat.format(date);
        //특정 속성값에 특정 값을 저장
        model.addAttribute("servTime", fomattedDate);

        return "25th/home";
    }
}
