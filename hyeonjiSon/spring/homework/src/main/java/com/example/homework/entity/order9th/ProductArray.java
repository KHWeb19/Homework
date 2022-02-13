package com.example.homework.entity.order9th;

import java.util.HashMap;
import java.util.Map;

//제품마다 배열 클래스를 만들어줄 것 없이
//이곳에서 TOTAL값 만큼 제품 배열을 만들어주고
//각각 Recommend제품 클래스에서 객체화를 통해 사용해도 좋을 것 같음.

//문제는 TOTAL값만큼 배열을 만들고, key에 번호를 부여하는 건 반복문으로 할 수 있겠는데
// value에 각각 다른 정보들을 넣는 건 어떻게 해야 좋을지 모르겠음.

public class ProductArray { //ProductArrayManager로 바꾸는 게 낫나?

    //일단 자료형 갯수가 가변할 수 있으니 List 자료형을 쓰는 편이 좋을까?
    //근데 하나하나 별도로 지정할 건 아니지 않나...
    //하나하나 지정할 거면 차라리 MAP이 나을 것 같기도 한데... key값만 찾으면 편하니까
    public ProductArray(int TOTAL){
        Map<Integer,Class> product = new HashMap<>();
        //Class에 클래스(=데이터 타입) 이름 적어줘야 한다.

        //Cloth에 해당하는 정보가 저장된...클래스를 객체화 한다.
        //20th 강의와 map-view 참고하자

       for(int i = 0; i < TOTAL; i++){
         //   map.put("key" + i, product)
        }
    }
}
