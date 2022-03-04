package com.example.demo.controller.order33;

import com.example.demo.entity.order33.Item;
import com.example.demo.service.order33.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/33th/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // 33th
    @GetMapping("/register")
    public String registerForm (Item item) {
        log.info("registerForm");

        return "/33th/item/register";
    }

    // 33th
    @PostMapping("/register")
    public String register (Item item, Model model) {
        log.info("DB register");

        itemService.register(item);

        return "/33th/item/success";
    }

    @GetMapping("/list")
    public String list (Model model) {
        log.info("list");

        model.addAttribute("list", itemService.list());

        return "/33th/item/list";
    }

    // 33th
    @GetMapping("/read")
    public String read (int itemId, Model model) {
        log.info("read");

        // 이렇게 적어놓지 않았을 경우엔
        // 리턴타입의 헝가리안 표기법으로 들어간다.
        // 즉 Board -> board
        // MemberAuth 라면 -> memberAuth 형태가되니 매우 주의해야함
        model.addAttribute(itemService.read(itemId));

        return "/33th/item/read";
    }

    @GetMapping("/modify")
    public String modifyForm (int itemId, Model model) {
        log.info("modifyForm");

        model.addAttribute(itemService.read(itemId));

        return "/33th/item/modify";
    }

    @PostMapping("/modify")
    public String modify (Item item, Model model) {
        log.info("modify");

        itemService.modify(item);

        return "/33th/item/success";
    }

    @PostMapping("/remove")
    public String remove (int itemId, Model model) {
        log.info("remove");

        itemService.remove(itemId);

        return "/33th/item/success";
    }

}
