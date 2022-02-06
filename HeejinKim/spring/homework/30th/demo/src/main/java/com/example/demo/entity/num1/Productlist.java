package com.example.demo.entity.num1;

import lombok.Data;

@Data
public class Productlist {

        //숫자 인덱스를 이용하여

        private final int APPLE_IDX = 0;
        private final int BANANA_IDX = 1;
        private final int BLUEBERRY_IDX = 2;
        private final int STRAWBERRY_IDX = 3;
        private final int PEAR_IDX = 4;

        private static final int TOTAL=5;
        int [] kindsOfFruit;
        //int [] priceArr;

        private final int MAX_KIND=5;
        private final int MIN_KIND=1;
        private int range_kind;

       /* private  final int MAX_PRICE=10000;
        private  final int MIN_PRICE=1000;
        private  int range_price; */



    public Productlist() {

        //빈 배열을 어떻게 넣어줄것인가...
        //일단 과일의 가격을 고정시키고 그 과일과 가격을 합쳐준다
        //priceArr= new int [TOTAL];

        kindsOfFruit = new int[TOTAL];
        kindsOfFruit[APPLE_IDX]     =1000;
        kindsOfFruit[BANANA_IDX]    =2000;
        kindsOfFruit[BLUEBERRY_IDX] =3000;
        kindsOfFruit[STRAWBERRY_IDX]=4000;
        kindsOfFruit[PEAR_IDX]      =5000;


        //randomFruit();
        //randomPrice();

    }


    public int randomFruit(){
        range_kind = MAX_KIND - MIN_KIND + 1;

        return (int) (Math.random() * range_kind + MIN_KIND);
    }


   /* public int randomPrice(){

        range_price = MAX_PRICE - MIN_PRICE + 1;

        return (int) (Math.random() * range_price + MIN_PRICE);

    }*/







}




