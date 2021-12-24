public class ForInfiniteLoopTest {
    public static void main(String[] args) {

        //초기화, 증감, 조건 모두 업어도 된다.
        //조건이 없으면? 무조건<<< 결국 무한 루프(반족)

        //문법 구조가 (초기화; 조건; 증감) 이므로 ;;은 반드시 입력해줘야 함
        for(;;){
            System.out.println("안녕!");
        }
    }
}


// if, while, for 문의 쓰임새가 조금 헷갈립니다
// if는 조건문 while은 반복문이라고 했을때 for은 이 두가지를 합쳐서 간단하게 하는 거라고 보면 될까요?