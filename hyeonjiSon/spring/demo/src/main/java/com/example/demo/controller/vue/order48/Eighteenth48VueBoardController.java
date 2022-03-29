package com.example.demo.controller.vue.order48;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/order48/vueboard")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
//CrossOrigin Annotation: 웹 페이지의 제한된 자원을 외부 도메인에서 접근을 허용해주는 매커니즘
                        //서로 다른 도메인에서 리소스를 공유하는 방식
public class Eighteenth48VueBoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/list") //사용자가 /list url을 요청하는 경우
    public ResponseEntity<List<Board>> getVueBoardList () {
            // <<보드>의 리스트>를 응답 요청하는 메소드
        log.info("getVueBoardList()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
                                  //보드서비스의 리스트, 상태코드.OK를 응답으로 전달
                  //Controller에선 ResponseEntity 사용이 안정적이다.
    }

    /*
    ResponseEntity 클래스란?
    - HttpEntity클래스를 상속받아 구현한 클래스이다.
          -HttpEntity란? HTTP 요청(Request), 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스
    - 즉, 응답을 보내는 Entity라는 것이다.
     */

    @PostMapping("/register")
    public ResponseEntity<Board> postRegisterBoard (@RequestBody Board board) {
        log.info("postRegisterBoard()");

        service.register(board);

        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}
