public class third10 {
    public static void main(String[] args) {
        int max = 10, min = 2;
        int range = max - min + 1;
        int move = 0;
        int sum = 0;


        for (int a = 1; a <=10; a++) {
            System.out.printf("========%d번째=======\n", a);
            int rand = (int) (Math.random() * range + min);
            for (int i = 1; i < 101; i++) {
                if (i == rand) {
                    move += i;
                    System.out.printf("랜덤 숫자 : %d\n", i);
                    System.out.printf("이동한 결과 : %d\n", (move));

                    sum += (i + move);
                    }
                }
            }
        System.out.print("\n\n이동한 결과값의 총 합 : " + sum);
        }

    }

