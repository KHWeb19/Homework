public class HW06 {
    public static void main(String[] args) {
        // 6. 1~100까지 숫자 중 3의 배수 출력

        for (int i = 1; i<=100; i++){
            if (i % 3 == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
