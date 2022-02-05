package com.example.homework.controller;

import com.example.homework.utility.area.Hexagon;
import com.example.homework.utility.area.Rectangle;
import com.example.homework.utility.area.Triangle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/9th/area")
public class Bank9Dash2And3Controller {

    @RequestMapping("/triangle")
    public String triangle() {
        log.info("triangle");

        Triangle tri = new Triangle(2, 2);
        tri.calcTriArea();

        model.addAttribute("triangle", tri.getTriArea());
        //왜 빨갛게 나오는 건지 모르겠음...
        //alt+Enter 누르면 create local variable 'model' 이라는 문구가 뜬다.
        // AttributedString model; <만들어주면
        //"triangle"이 attribute: 라고 뜨지만 빨간 밑줄이 뜨면서
        //'addAttribute(java.text.AttributedCharacterIterator.Attribute, java.lang.Object)' in 'java.text.AttributedString' cannot be applied to '(java.lang.String, int)'
        //라는 문구가 뜬다. int형이 아니라 string형으로 입력하라는 뜻인지... triangle이라는 int 변수를 만든 적도 없는데 왜 뜨는지 모르겠음...

        return "9th/triangle";
    }

    @RequestMapping("/rectangle")
    public String rectangle(){
        log.info("rectangle");

        Rectangle rect = new Rectangle(2, 2);

        model.addAttribute("rectangle", rect.getAreaBase());
        return "9th/rectangle";
    }

    @RequestMapping("/hexagon")
    public String hexagon(){
        log.info("hexagon");

        Hexagon hex = new Hexagon(2, 2);

        model.addAttribute("hexagon", rect.getAreaBase());

        return "9th/hexagon";
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

 */
