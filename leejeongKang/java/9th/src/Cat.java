import java.util.Scanner;

public class Cat {

        public String name;
        public String kind;
        public char gender;
        public int age;

        boolean isTrue = true;

        public void CatPlay() {
                while (isTrue) {
                        System.out.println("고양이 행동을 취하려면 1번 2번 3번 중 하나를 입력하세요");
                        Scanner scanner = new Scanner(System.in);
                        int num = scanner.nextInt();
                        if (num == 1) {
                                System.out.println("고양이가 밥을 먹는다");
                                break;
                        } else if (num == 2) {
                                System.out.println("고양이가 잠을잔다.");
                                break;
                        } else if (num == 3) {
                                System.out.println("고양이를 놀아준다");
                                break;
                        } else {
                                System.out.println("잘못된 번호입니다. 다시 입력하세요");
                        }


                }
        }
}