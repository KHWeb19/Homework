public class M9 {
    public static void main(String[] args) {
        //2~10사이의 랜덤 숫자를 추출해내고 0~100까지의 배수들 구하기
        //위 작업을 3번 반복
        //구한 배수들의 합 구하기
     /*   int sum=0;
        int sum2=0;
        int sum3=0;


        int random1 = (int) (Math.random() * 9 + 2);

        for (int i = 0; i <= 100; i++) {
            if (i % random1 == 0) {
                System.out.printf("2~10사이의 첫번째 랜덤 숫자%d의 100까지의 배수는 %d이다\n.", random1, i);
                sum += i;
            }
        }
        int random2 = (int) (Math.random() * 9 + 2);

        for (int i2 = 0; i2 <= 100; i2++) {
            if (i2 % random2 == 0) {
                System.out.printf("2~10사이의 두번째 랜덤 숫자%d의 100까지의 배수는 %d이다\n.", random2, i2);
                sum2 += i2;
            }
        }
        int random3 = (int) (Math.random() * 9 + 2);

        for (int i3 = 0; i3 <= 100; i3++) {
            if (i3 % random3 == 0) {
                System.out.printf("2~10사이의 세번째 랜덤 숫자%d의 100까지의 배수는 %d이다\n.", random3, i3);
                sum3 += i3;
            }
        }
        int sumTotal=sum+sum2+sum3;
        System.out.printf("위 배수들의 총합은%d이다\n",sumTotal);

    }
      */

        /*  1 ~ 100까지의 숫자를 순회한다.
            2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
            다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다. */

        // 구현 전략이 필요함
        // 1. 1 ~ 100까지 숫자 순회는 for문을 사용
        // 2. for 문 내부에서 랜덤 난수 생성 2 ~ 10
        // 3. 난수의 배수를 검사하기 전까지 랜덤을 다시 생성하면 안됨

        // 실제 난수의 할당(생성) 했는지 안했는지 판정 여부
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        boolean isRandomAllocCheck = false;
        int decision = 0;
        int sum = 0;
        for (int i = START; i <= END; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + MIN);
                System.out.printf("%d번째 반복\n",i);
                isRandomAllocCheck = true;//false로 변경하여 다음 루프로 decision값을 넘겨줌(true인 상태라면 while이 무한 반복됨)
            }

            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;//숫자를 다시 랜덤으로 돌리기위해 true로 변경하여 while를 다시 실행)

                sum += i;
            }

        }
        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}