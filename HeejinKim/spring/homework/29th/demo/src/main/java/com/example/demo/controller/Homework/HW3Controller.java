package com.example.demo.controller.Homework;

import com.example.demo.Homework.HW2.Lotto;
import com.example.demo.Homework.HW3.Area;
import com.example.demo.Homework.HW3.Hexagon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/homework9/num3")
public class HW3Controller {
    /*3.넓이 계산하던 문제를 함꼐 응용
   웹상에 정삼각형, 정사각형, 정육각형을 선택할 수 있도록 만듭니다.
   각 버튼에 따라서 이를 올바르게 처리할 수 있도록 서포트하여
   올바른 넓이값을 화면상에 출력할 수 있도록 만들어봅시다!
  (이번 케이스는 구지 적분 방식으로 미소 면적을 모두 합산하지 않아도 됩니다)
*/
    @ResponseBody
    @GetMapping("/area")
    public Area area()  {

       // log.info("area()");

        Area area=new Area();
        Hexagon he=new Hexagon();

        log.info("Area: " + area);

        return area;
    }





}
