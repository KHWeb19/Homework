public class Homework6 {
    public static void main(String[] args) {
        // 1 ~ 100까지 3의 배수만 출력하세요.
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println("짝수 = " + i);
            }
        }
    }
}

