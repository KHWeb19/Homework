package com.example.demo.controller29HW;

import com.example.demo.entity.order29.Area.Area;
import com.example.demo.entity.order29.response.AreaResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/bank9_3")
public class Bank9_3 {
    @GetMapping("/main")
    public String main (){
        log.info("main()");

        return "29thHW/area/main";
    }

    @ResponseBody
    @PostMapping("/triangle")
    public AreaResponse triangle(Model model) {
        log.info("triangle()");
        Area area = new Area(1,7);

        AreaResponse ar = new AreaResponse(area);
        return ar;
    }

    @ResponseBody
    @PostMapping("/square")
    public AreaResponse square(Model model) {
        log.info("square()");
        Area area = new Area(2,6);

        AreaResponse ar = new AreaResponse(area);
        return ar;
    }

    @ResponseBody
    @PostMapping("/hexagon")
    public AreaResponse hexagon(Model model) {
        log.info("hexagon()");
        Area area = new Area(3,12);

        AreaResponse ar = new AreaResponse(area);

        return ar;
    }
}
