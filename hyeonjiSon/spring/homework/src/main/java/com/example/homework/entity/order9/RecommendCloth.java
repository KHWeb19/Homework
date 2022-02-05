package com.example.homework.entity.order9;

import java.util.HashMap;
import java.util.Map;

public class RecommendCloth extends RandomPick {
    //0~9(총 TOTAL개짜리 배열) 안에 각각의 Cloth 클래스들을 넣어주면 되나.
    //상품은 10개 정도 넣을 거니까 배열 10개 주소값에 상품 10개 클래스 집어넣는 게
    //그렇게 번거롭진 않겠지만...매번 이렇게 하나씩 넣어주는 게 좋은 방법일까...
    //더 효율적인 방법이 있을텐데, 배웠던 거 같은데 기억이 안나네...

    public RecommendCloth(int TOTAL, int MAX){
        super(); //controller에서 추천 상품 갯수를 직접 받고 여기엔 변수명만 표시하도록 고치자

        //String, Integer 데이터 타입을 포함하는 MAP 배열을 만든다.
        Map<String, Integer> cloth = new HashMap<>();

        String[] name = {"원피스", "청바지", "패딩 조끼", "티셔츠", "코트", "잠옷 세트", "블라우스", "후리스",};
        Integer[] price = {70000, 30000, 36000, 15000, 150000, 21000, 27500, 45000};

        //foreach를 이용해 MAP key0~TOTAL 마다 name과 price를 하나하나 떼어 배치해준다...?
        //이걸 어떻게 하면 좋은거지?
       // for(String name, Integer price: cloth){

        };

        //MAX만큼 돌아가는 반복문을 만들어서
        //품목[randIdx](주소) = 랜덤상품 정보(값) 가 나오도록 만들어준다.
        //   --------- → RandomPick에서 나온 랜덤 숫자

      //  for(int i = 0; i < MAX; i++){
           // Product[randIdx] = value
        }
