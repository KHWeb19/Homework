package com.example.demo.controller.jpa.order58th;

import com.example.demo.entity.jpa.VueJpaMember;
import com.example.demo.service.jpa.order58.VueJpaMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/vueJpaMember")
@RestController
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class VueJPAMemberController {

    @Autowired
    private VueJpaMemberService service;

    @PostMapping("/register")
    public VueJpaMember register (@Validated @RequestBody VueJpaMember member){
        log.info("register request from vue" + member);

        service.register(member);
        return member;
    }
}
