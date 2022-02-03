package com.example.demo.Homework.HW1;

import lombok.Data;


@Data
public class Product {

     /* Product 클래스를 만들어보자
    Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
    오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
    오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
    추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자! */

    //1.product 클래스 에는 과일 종류 와 가격이 배열로 들어있다. //과일의 인덱스 번호 >>>배열.. 가격은 랜덤하게
    //                                                   >> 가격이 랜덤이 아니라 과일의 인덱스가 랜덤하게 가격은 정해져 있게끔
    //2.과일의 종류는 정해져있고 가격은 랜덤이다.
    //3.사용자가 get으로 지정하여 들어감
    //4.오늘의 추천 상품이라는 버튼을 생성 >>>post로 받아온다

    private final int APPLE_IDX = 0;
    private final int BANANA_IDX = 1;
    private final int BLUEBERRY_IDX = 2;
    private final int STRAWBERRY_IDX = 3;
    private final int PEAR_IDX = 4;

    private final int TOTAL=5;

    private int [] kindsOfFruit;
    private int [] randomFruit;

    private final int MAX_KIND=5;
    private final int MIN_KIND=1;
    private int range_kind;

    int tmp;
    int IdxNumber;
    int i;

    public Product() {

        kindsOfFruit = new int[TOTAL];


        kindsOfFruit[APPLE_IDX] = 2000;
        kindsOfFruit[BANANA_IDX] = 2000;
        kindsOfFruit[BLUEBERRY_IDX] = 2000;
        kindsOfFruit[STRAWBERRY_IDX] = 2000;
        kindsOfFruit[PEAR_IDX] = 2000;


       /* for ( i = 0; i < TOTAL; i++) {

            range_kind = MAX_KIND - MIN_KIND + 1;
            tmp = (int) (Math.random() * range_kind + MIN_KIND);
            randomFruit[i] = kindsOfFruit[tmp];
        } */

    }
    public void randomFruits(){
        for ( i = 0; i < TOTAL; i++) {

            range_kind = MAX_KIND - MIN_KIND + 1;
            tmp = (int) (Math.random() * range_kind + MIN_KIND);
            randomFruit[i] = kindsOfFruit[tmp];
        }
        System.out.println(randomFruit[i]);

    }
}

