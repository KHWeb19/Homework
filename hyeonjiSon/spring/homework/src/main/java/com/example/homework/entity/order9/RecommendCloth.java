package com.example.homework.entity.order9;

public class RecommendCloth extends RandomPick {
    //0~9(총 10개짜리 배열) 안에 각각의 Cloth 클래스들을 넣어주면 되나.
    //상품은 10개 정도 넣을 거니까 배열 10개 주소값에 상품 10개 클래스 집어넣는 게
    //그렇게 번거롭진 않겠지만...매번 이렇게 하나씩 넣어주는 게 좋은 방법일까...
    //더 효율적인 방법이 있을텐데, 배웠던 거 같은데 기억이 안나네...

    //일단 자료형 갯수가 가변할 수 있으니 List 자료형을 쓰는 편이 좋을 것 같다.
    //근데 List를 쓰면 random() 필요없이 suffle()을 사용할 수 있지 않을까?
    public RecommendCloth(){
        super(2);
    }
}
