package com.example.demo.utility.utility29th.Polygon;
/*

3. 일전에 우리가 넓이 계산하던 문제를 함꼐 응용해보는 문제입니다.
   웹상에 정삼각형, 정사각형, 정육각형을 선택할 수 있도록 만듭니다.
   각 버튼에 따라서 이를 올바르게 처리할 수 있도록 서포트하여
   올바른 넓이값을 화면상에 출력할 수 있도록 만들어봅시다!
   (이번 케이스는 구지 적분 방식으로 미소 면적을 모두 합산하지 않아도 됩니다)

 */

import lombok.Data;

@Data
public class Polygon {
    float selectPolygon;
    float length;
    float area;

    public Polygon(float selectPolygon, float length){
        this.selectPolygon = selectPolygon;
        this.length = length;
    }

    public float calcArea(){
        float radius = (length / 2) / (float)Math.tan(Math.PI / selectPolygon);
        float innerTriArea = (length * radius)/2;
        area = innerTriArea * selectPolygon;

        return area;
    }


}
