public class Q7번문제 {
    public static void main(String[] args) {
        // 7. 1 ~ 100까지 숫자중 4의 배수를 더한 결과를 출력해보자!

            int sum = 0;

            for (int i = 1; i < 101; i++) {
                if(i % 4 == 0)
                    sum += i;
            }
            System.out.println("4의 배수를 더한 결과 = " + sum);
    }
}
