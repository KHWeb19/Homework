package com.example.homework.controller;

import com.example.homework.utility.area.BaseCalc;
import com.example.homework.utility.area.PolygonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/9th3")
public class Bank9Dash2And3Controller {

    @GetMapping("/prob")
    public String getBank9Prob3 () {
        log.info("get getBank9Prob3()");

        return "9th3/prob/prob";
    }

    @ResponseBody
    @PostMapping("/triangle")
    public PolygonResponse triangle() {
        log.info("triangle");

        BaseCalc bc = new BaseCalc(2);
        bc.calcTriangleArea();

        PolygonResponse pr = new PolygonResponse(bc);

        return pr;
    }

    @ResponseBody
    @PostMapping("/rectangle")
    public PolygonResponse rectangle() {
        log.info("rectangle");

        BaseCalc bc = new BaseCalc(2);
        bc.calcSquareArea();

        PolygonResponse pr = new PolygonResponse(bc);

        return pr;
    }

    @ResponseBody
    @PostMapping("/hexagon")
    public PolygonResponse hexagon() {
        log.info("hexagon");

        BaseCalc bc = new BaseCalc(2);
        bc.calcHexagonArea();

        PolygonResponse pr = new PolygonResponse(bc);

        return pr;
    }

}

/*
3. 일전에 우리가 넓이 계산하던 문제를 함꼐 응용해보는 문제입니다.
   웹상에 정삼각형, 정사각형, 정육각형을 선택할 수 있도록 만듭니다.
     //정삼각형 : 밑변 x 높이 /2
     //정사각형 : 밑변 x 높이
     //정육각형 : 밑변 x 높이 x 3 (정육각형은 작은 정삼각형 6개가 있는 형태)

        //모두 밑변x높이의 과정은 공통적으로 들어간다.
        //부가적인 계산은 변수 값을 받아서 각자 클래스에서 마저 진행해도 될 것 같다.

   각 버튼에 따라서 이를 올바르게 처리할 수 있도록 서포트하여
   올바른 넓이값을 화면상에 출력할 수 있도록 만들어봅시다!
   (이번 케이스는 구지 적분 방식으로 미소 면적을 모두 합산하지 않아도 됩니다)
            //그럼 스레드 없이 만드는 게 낫겠다.

          → 정육각형을 구성하는 삼각형 6개는 정삼각형의 형태가 아니므로 위의 공식을 사용하면
            정확한 넓이를 구할 수가 없다.
            선생님이 활용한 방식을 사용해 복습해보자.

 */
