package com.example.demo.utillity;


import java.io.PrintStream;
import lombok.Data;
@Data
public class product {

    private int range;
//과일과 가격의 배열의 형성
    String[] fruit;
    String[] Price;

    public product(int range) {
        this.range = range;
        fruit = new String[]{"Apple", "Banana", "pineApple"};
        Price = new String[]{"1000", "2000", "3000"};

    }

    public int selectNum() {
        return (int) Math.random() * range;
    }
//랜덤으로 바로 상품을 뽑아낼수 있게끔 설정
    public void getValue() {
        System.out.printf("오늘의 추천 상품 %s! 가격:%s", fruit[selectNum()], Price[selectNum()]);

    }
//ResponseBody호출용
    private String selectedFruit=fruit[selectNum()];
    private String selectedPrice=Price[selectNum()];
}
