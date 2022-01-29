package com.example.demo.controller;


    //정보를 보호해야될때는 post 아니면 get (url에 다 노출된다)
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

    @Slf4j
    @Controller
    @RequestMapping("/29th/board")
    public class SecondController29th {

        @GetMapping("/main")
        public String boardMain () {
            log.info("boardMain()");

            return "29th/board/main";
        }


        @GetMapping("/registerGet")
        public String registerGet () {
            log.info("registerGetForm()");

            return "29th/board/registerGet";
        }


        @PostMapping("/registerPost")
        public String registerPost () {
            log.info("registerPost()");

            return "29th/board/registerPost";
        }

        @GetMapping("/modifyGet")
        public String modifyGet () {
            log.info("modifyGetForm()");

            return "29th/board/modifyGet";
        }

        @PostMapping("/modifyPost")
        public String modifyPost () {
            log.info("modifyPostForm()");

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

