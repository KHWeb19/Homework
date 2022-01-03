public class Test5 {
    public static void main(String[] args) {

        // 1 ~ 100 까지 숫자 중 짝수만 출력

        for (int n = 1; n < 101; n++) {
            if (n % 2 == 0){
                System.out.println("짝수 : " + n);
            }
        }
    }
}
