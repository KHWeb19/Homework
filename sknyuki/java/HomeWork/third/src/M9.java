public class M9 {
    public static void main(String[] args) {
        //2~10사이의 랜덤 숫자를 추출해내고 0~100까지의 배수들 구하기
        //위 작업을 3번 반복
        //구한 배수들의 합 구하기
        int sum=0;
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

}