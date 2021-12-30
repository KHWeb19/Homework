//Scanner 클래스 쓸 수 있도록 자바유틸을 불러옴.
import java.util.Scanner;
public class Ans1 {public static void main(String[] args) {
    ////올바르게 나오는 최대 항 범위
    final int MAX = 31;
    ////시작하는 항(컴퓨터 상으로 0, 실제로는 1)
    final int START_IDX = 0;
    ////바탕 수(?) 우리의 주인공
    final int BASE = 2;
    ////Scanner에 입력할 값에 대한 정보(?)
    System.out.print("찾고자하는 수열의 항을 입력해주세요: ");
    ////스캐너 클래스의 객체 생성
    Scanner scan = new Scanner(System.in);
    ////입력한 내용을 idx에 저장
    int idx = scan.nextInt();
    ////입력한 내용을 배열로 만들기(?)
    int[] seq = new int[idx];
    ////입력받은 내용이 31보다 크면
    if (idx > MAX) {
        ////표현 못한다고 전해라.
        System.out.println("낵아 표현이 으앙돼 ㅠ 프로그램을 종료합니다.");
    ////입력받은 내용이 31보다 작으면
    } else {
        ////임의의 변수 i로 START_IDX를 초기화 시키고,
        ////i는 idx보다 작아야하며,
        ////한번 출력된 후 점점 1씩 증가해서 idx보다 작은 수까지 출력된다.
        for (int i = START_IDX; i < idx; i++) {
            ////입력한 수 i만큼의 배열을 생성하는데 결과값은 2의 i승을 정수로 표현한 것.
            seq[i] = (int) Math.pow(BASE, i);
            ////결론 적으로 i번째 배열 = seq[i] 의 값이 나온다.
            System.out.printf("seq[%d] = %d\n", i, seq[i]);
        }
    }
}
}
