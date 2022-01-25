public class third9 {
    public static void main(String[] args) {



        ////////솔루션 1번

        System.out.println("솔루션 1번");
        int max = 10, min = 2;
        int range = max - min + 1;
        int sum = 0;
        boolean isChar = false;
        for (int i = 1; i < 101; i++) {
                while (!isChar) {
                    int rand = (int) (Math.random() * range + min);
                if (i == rand) {
                    System.out.printf("랜덤 숫자 : %d\n", i);
                    for (int j = 1; i * j < 101; j++) {
                        System.out.printf("랜덤 숫자의 배수 : %d\n", i * j);
                        sum += (i * j);}
                    isChar = true; }
                }
        }


        //for문에서 i가 100을 초과할때 무한루프 빠져나오기


        System.out.println("\n출력값의 총 합 : " + sum);





            ///////솔루션 2번
            System.out.println("\n\n\n솔루션2번");
            int sum2 = 0;
            for (int i2 = 1; i2 <= 10; i2++) {
                int rand2 = (int) (Math.random() * 9 + 2);
                System.out.printf("\n********%d번째**********\n범위 안의 랜덤 숫자 : %d\n", i2, rand2);
                for (int j2 = 1; j2 <= 100; j2++) {
                    if (j2 % rand2 == 0) {
                        System.out.printf("랜덤 숫자의 배수 : %d\n", j2);
                        sum2 += j2;}
                }
            }
            System.out.printf("\n출력값의 총 합 : %d\n", sum2);
        }
    }



