public class M7 {
    public static void main(String[] args) {
        //2~10사이의 랜덤 숫자를 추출해내고 0~100까지의 배수들 구하기
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0) {
                sum += i;

            }
            System.out.printf("정수 %d까지의 4의 배수의 합은 %d입니다.\n",i, sum);
        }
    }
}