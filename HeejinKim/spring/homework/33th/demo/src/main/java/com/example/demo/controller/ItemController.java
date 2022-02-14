package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/34th/fruit")
public class ItemController {

    @Autowired //BoardServicelmpl과 연결
    private ItemService itemService;



    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        model.addAttribute("list", itemService.list());

        return "/34th/item/list";
    }

    @GetMapping("/register")
    public String registerForm (Item item){
        log.info("registerForm");

        return "/34th/item/register";
    }

    @PostMapping("/register")
    public String register (Item item,Model model){
        log.info("DB register - item 정보 : " + item);

        itemService.register(item);

        return "/34th/item/success";
    }

    @GetMapping("/read")
    public String read (int itemNo,Model model) {
        log.info("read");

        model.addAttribute(itemService.read(itemNo));

        return "/34th/item/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int itemNo, Model model) {
        log.info("modifyForm");

        // 현재 작성된 내용 연동 (데이터)
        model.addAttribute(itemService.read(itemNo));

        return "/34th/item/modify";
    }


    // modify HTML 페이지에서 수정하기 눌렀을 경우
    @PostMapping("/modify")
    public String modify (Item item, Model model) {
        log.info("modify");

        // DB에 내용 갱신
        itemService.modify(item);

        return "/34th/item/success";
    }


    @PostMapping("/remove")
    public String remove(int itemNo,Model model) {
        log.info("remove");

        itemService.remove(itemNo);

        return "/34th/item/success";

    }


}
