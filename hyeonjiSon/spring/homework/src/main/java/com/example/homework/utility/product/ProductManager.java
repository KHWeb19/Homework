package com.example.homework.utility.product;

import com.example.homework.entity.order9.RecommendBook;
import com.example.homework.entity.order9.RecommendCloth;

public class ProductManager {

    private RecommendCloth[] rCloth;
    private RecommendBook[] rBook;

    private final int CHOOSENUM = 3;
    private int serviceCode;

    public ProductManager(int serviceCode){

        this.serviceCode = serviceCode;
        randomRecommand();
    }

    //recommendProduct를 실행 하면 랜덤 추천 상품이 3개 나오도록 만들자
    //전역 변수를 사용해서 1번 상품(의류)나 2번 상품(책)이 나오게 해볼까
    //쓰레드는 필요없고 상속까진 잘 활용하면 좋을 것 같다.
    public void randomRecommand(){
        switch(serviceCode){
            //일반 배열이 아니라 MAP 배열을 쓰고 싶음...
            case ProductNumber.CLOTH:
                rCloth = new RecommendCloth[CHOOSENUM]; //총 3개짜리 배열 선언
                break;

            case ProductNumber.BOOK:
                rBook = new RecommendBook[CHOOSENUM];
                break;
        }
        //세 개를 뽑는 반복문은 어디에 들어가면 좋나...
        //상품 중 3개를 뽑는 반복문이 들어있는 클래스를 상품 클래스들이 상속받게 만들까?
    }
}
