import java.util.Scanner;

public class Date6thAns1 {
    /*  아래와 같은 등비 수열이 있다.
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
        사용자 입력을 통해 원하는 위치의 값을 뽑아내도록 프로그래밍 해보자!
        (1 ~ 32번째 혹은 31번째 항까지만 올바른 결과가 나올 것임) */
    static int max = 31;
    private int START_IDX = 0;
    private int BASE = 2;
    private Scanner scan;
    static int[] sep;
    private int num;

    public void initSequence() {
        // 우선 scan, 배열 초기값 잡으려고했음
        scan = new Scanner(System.in);
        num = scan.nextInt();
        sep = new int[max];
        System.out.println(num + "값을 입력했습니다.");

    }

    public void process() {
        if (num > max) {
            System.out.println("낵아 표현이 으앙돼 ㅠ 프로그램을 종료합니다.");
        } else {
            for (int i = START_IDX; i < num; i++) {
                sep[i] = (int) Math.pow(BASE, i);
                System.out.printf("seq[%d] = %d\n", i, sep[i]);
            }
        }
    }
}


/*
흐름을 생각하자?
일단
1. 처음세팅
수열 값 입력의 scanner 입력..
2.
 */