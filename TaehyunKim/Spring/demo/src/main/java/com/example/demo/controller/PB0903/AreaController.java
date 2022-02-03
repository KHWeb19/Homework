package com.example.demo.controller.PB0903;

import com.example.demo.entity.PB0903.AreaCalculator;
import com.example.demo.entity.PB0903.RectangleCalculator;
import com.example.demo.entity.PB0903.TriangleCalculator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.image.AreaAveragingScaleFilter;

@Slf4j
@Controller
@RequestMapping("/PB0903")
public class AreaController {

    @GetMapping("/main")
    public String main(){
        log.info("main()");
        return "/PB0903/main";
    }

    @PostMapping("triangle")
    public String triangle(@RequestParam(name = "length") String l, @RequestParam( name = "height") String h, Model model)
    {
        log.info("triangle");

        int length = Integer.parseInt(l);
        int height = Integer.parseInt(h);

        AreaCalculator ac = new AreaCalculator(1,length,height);

        model.addAttribute("area", ac.getArea());
        return "PB0903/triangle";
    }



}
