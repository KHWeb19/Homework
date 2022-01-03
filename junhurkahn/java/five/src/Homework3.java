import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //선생님 하다가 도저히 안되서 구글링해서 코드 가져왔습니다 죄송합니다ㅠㅠ
        //Random 새로운 코드를 써봄
        Random Random = new Random();
        Scanner scan = new Scanner(System.in);

        // 1~20까지의 숫자를 6개 랜덤 생성
        System.out.print("생성된 로또 번호:");
        // 로또 번호를 6개로 하기위해서 배열 6사용
        int Array[] = new int[6];
        // Array.length라는 새로운 코드 발견
        for (int i = 0; i < Array.length; i++) {
            // 당첨 로또번호 출력
            Array[i] = Random.nextInt(21); // 0~20까지 반복횟수 Random
            System.out.print(" " + Array[i]);
        }

        System.out.println("");
        System.out.println("사용할 숫자 :6개를 입력하시오 ");

        int iArray[] = new int[6];
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = scan.nextInt();
        }

        // 배열끼리 비교
        // 숫자가 많으면 다음으로 넘어가기
        int check = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                if (Array[i] == iArray[j]) {
                    check++;
                }
            }
        }

        // 배우지 않은 switch문 코드

        switch (check) {
            case 6:
                System.out.print("1등에 당첨되었습니다.");
                break;
            case 5:
                System.out.print("2등에 당첨되었습니다.");
                break;
            case 4:
                System.out.print("3등에 당첨되었습니다.");
                break;
            case 3:
                System.out.print("4등에 당첨되었습니다.");
                break;
            case 2:
                System.out.print("5등에 당첨되었습니다.");
                break;
            default:
                System.out.print("당첨되지 않았습니다.");
        }
    }
}
