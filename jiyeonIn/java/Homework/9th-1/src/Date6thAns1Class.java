import java.util.Scanner;

public class Date6thAns1Class {
    public static void main(String[] args) {
        /*  아래와 같은 등비 수열이 있다.
            1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
            사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
            (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) */

        Date6thAns1 d6 = new Date6thAns1();

        System.out.print("찾고자하는 수열의 항을 입력해주세요: ");
        d6.initSequence();

        int[] seq = new int[Date6thAns1.max];
        d6.process();

    }
}
/*
흐름을 생각하자?
일단 배열과 스캐너를 생성한다.
2^n승을 더해준다.....
1. 처음세팅
수열 값 입력의 scanner 입력..
2.
 */