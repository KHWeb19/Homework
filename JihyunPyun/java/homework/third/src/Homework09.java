public class Homework09 {
    public static void main(String[] args) {
        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;

        int sum = 0;
        int num = 1;

        while (num <= 3) {
            int random = (int) (Math.random() * range + MIN);
            System.out.print(random + "의 배수 : ");
            for (int i = 1; i <= 100; i++) {
                if (i % random == 0) {
                    System.out.print( i + " ");
                    sum += i;
                }
            }
            num++;
            System.out.println();
        }
        System.out.println();
        System.out.println("출력된 숫자들의 합 : " + sum);
        }
    }

