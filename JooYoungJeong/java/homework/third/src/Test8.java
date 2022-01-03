public class Test8 {
    public static void main(String[] args) {

        // 1 ~ 100 까지 숫자 순회
        // 2 ~ 10 사이의 랜덤한 숫자 선택 후 배수 출력

       for (int n = 1; n <= 100; n++) {

            int num = (int) (Math.random() * 9 + 2);

            //System.out.println("i = " + n);

            while (num < 10){
                num++;
            if (n % 2 < 11) {
                    System.out.printf("2 ~ 10 랜덤배수 = %d\n", num);
                }
            }
        }
    }
}