import java.util.Arrays;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
//       배열로 로또 문제를 만들어보기!
//       100명 중 5명 당첨
//       배열값에 당첨되는 자리를 배치해놓고
//       사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다. (?)

        Scanner sc = new Scanner(System.in);

        final int MAX = 100, MIN = 1;
        int range = MAX - MIN + 1;
        final int ARRMAX = 5; /// 당첨번호 5개

        int[] lotto = new int[ARRMAX]; // 당첨 번호를 넣어둘 배열

        System.out.print("1~100 사이의 번호를 선택하세요 : ");
        int select = sc.nextInt();

        for (int i = 0; i < lotto.length; i++){
            int random = (int)(Math.random() * range + MIN);
            lotto[i] = random;
        }
        for (int i = 0; i < lotto.length; i++){
            if (select == lotto[i]) {
                System.out.println("당첨 입니다.");
            }
            else {
                System.out.println("꽝");
                break;
            }
        }

        System.out.println("당첨 번호 : "+Arrays.toString(lotto));
    }
}
