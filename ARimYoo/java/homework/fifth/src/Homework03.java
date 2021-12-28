import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        // 배열로 로또 문제를 만들어보기!
        // 실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        // 실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        // 배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 100개의 숫자 중 5군데를 골라 당첨값 설정
        // 사용자가 돌려서 당첨 = scanner을 사용하고
        // 설정한 값을 선택하면 "당첨입니다" 출력 --> if문 활용
        // 아니면 "꽝" 출력

        Scanner scan = new Scanner(System.in);
        System.out.print("로또 번호를 골라주세요 : ");
        int end = scan.nextInt();

        final int START = 1;

        int[] lotto = new int[end];

        lotto[0] = 0;

        for (int i = START; i < 100; i++) {

            lotto[i] = lotto[i-1] + 1;

            // 당첨값 임의설정
            if (lotto[i] == 13 || lotto[i] == 33 || lotto[i] == 53 || lotto[i] == 73 || lotto[i] == 93) {
                System.out.println("당첨입니다");
            } else {
                System.out.println("꽝");

                // 사용자가 입력한 번호의 값만 "당첨입니다" 출력을 어떻게 하는지 모르겠다..


            }


        }
    }
}