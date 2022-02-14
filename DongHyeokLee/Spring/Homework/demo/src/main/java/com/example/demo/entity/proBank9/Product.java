package com.example.demo.entity.proBank9;

//Product 클래스를 만들어보자
//Random을 활용하여 임의의 상품과 가격들이 들어갈 수 있도록 만들도록 한다.
//오늘 학습한 Get 을 활용하여 사용자가 URL을 요청한다.
//오늘의 추천 상품을 누르면 POST쪽에서 알아서 상품이 들어가도록 만들고
//추천된 상품의 결과를 JSON Viewer를 통해서 화면상에 출력하도록 만들어보자!

//Random을 활용하여 임의의 상품과 가격
// 가격은 random활용
// 상품은 상품에 번호 붙여서 random을 돌리면 되려나
// 그럼 초기 상품 번호 붙여 주는건 일일이 다 정해주어야 하는가?
// 상품이 10개 있다 치면 그게 자동으로 들어가면서 번호가 부여 되면 안되는가?
//

//POST 쪽에서 알아서 상품이 들어가도록 만들고를 어찌 해야하지
//여기서 어떻게 하냐에 따라 JSON으로 처리 되는거 같음


import lombok.Data;


import java.util.Random;

@Data
public class Product {
    //이부분이 웹에서 JSON으로 처리 되어서 나온는거 같음
    private Random generator;
    private String[] goods;
    private int[] price;
    private int recommendGoodsNum;
    private int goodsNum;
    //private final int goodsNum = 5;
    //private final int MAX_PRICE = 10000;
    //private final int MIN_PRICE = 3000;
    //private int range = MAX_PRICE - MIN_PRICE + 1;
    //private int recommendGoodsNum = 3;
    //private int selectGoods;
    //private int[] checkDup;
    //private boolean isRealloc = true;


    public Product(final int recommendGoodsNum , final int goodsNum){
        this.goodsNum = goodsNum;
        this.recommendGoodsNum = recommendGoodsNum;
        generator = new Random();
        goods = new String[recommendGoodsNum];
        price = new int[recommendGoodsNum];

        recommendGoods();
        goodsPrice();


    }


    public void recommendGoods(){


        int selectGoods = 0;
        boolean isRealloc = true;
        int[] checkDup = new int[recommendGoodsNum];

        for(int i = 0 , allocCnt = 0; i < recommendGoodsNum; i++) {

            while (isRealloc) {
                selectGoods = generator.nextInt(goodsNum);

                isRealloc = false;

                for (int j = 0; j < allocCnt; j++) {
                    if (selectGoods == checkDup[j]) {
                        isRealloc = true;
                        break;
                    }
                }
            }

            goods[i] = ProductName.goodsName.get(selectGoods);
            checkDup[allocCnt++] = selectGoods;
            isRealloc = true;
        }
    }

    public void goodsPrice(){

        int PRICE_MAX = 10000;
        int PRICE_MIN = 7000;
        int range = PRICE_MAX - PRICE_MIN + 1;

        for(int i = 0 ; i < recommendGoodsNum; i++){
            price[i] = generator.nextInt(range) + PRICE_MIN;
        }

    }

}



