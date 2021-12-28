import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        //3. 배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        //1) 랜덤 생성해서 해당 인덱스에 1 * 5개 넣기
        //2) 1~100인덱스 입력 받기
        //3) 입력받은 인덱스에 1이 있으면 "당첨" 출력

        int rand;
        final int WIN = 5;
        final int MIN = 0;
        final int MAX = 99;
        int[] arr = new int[MAX+1];
        //1)
        for (int i=0; i<WIN; i++){
            rand = (int)(Math.random()*(MAX+1));
            arr[rand] = 1;
        }
        //2)
        System.out.printf("%d~%d 중 하나를 선택하시오.\n", MIN, MAX);
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //3)
        if (arr[num] == 1) {
            System.out.println("당첨입니다.");
        } else {
            System.out.println("꽝");
        }
    }
}
