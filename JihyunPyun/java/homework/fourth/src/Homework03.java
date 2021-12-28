import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
//       배열로 로또 문제를 만들어보기!
//       100명 중 5명 당첨
//       배열값에 당첨되는 자리를 배치해놓고
//       사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다. (?)

//        문제를 제대로 이해했는지 모르겠지만...
//        1. 5칸 배열 생성 (100명중 5명 당첨이니까)
//        2. random메서드로 난수 생성 (당첨 번호)
//        3. 입력값 받고, 당첨 번호랑 비교
//        4. 당첨 메시지 출력

        Scanner sc = new Scanner(System.in);

        final int MAX = 46, MIN = 1;
        int range = MAX - MIN + 1;
        final int ARRMAX = 5;

        int[] lotto = new int[ARRMAX]; //당첨 번호를 넣어둘 배열

        System.out.println("1~46 사이의 번호를 선택하세요");
        int select = sc.nextInt();

        for (int i = 0; i < lotto.length; i++){
            int random = (int)(Math.random() * range + MIN);
            lotto[i] = random;
            if (select == random) {
                System.out.println("당첨 입니다.");
            }
            else {
                System.out.println("꽝");
                break;
            }
        }
    }
}
