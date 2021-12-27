public class Q8 {
    public static void main(String[] args) {
        // 8. 1 ~ 100까지 숫자를 순회한다.
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

        int i = (int)(Math.random()*9+2);

        for (int i2 = 1; i2 < 101; i2++) {
            if (i2 % i == 0) {
                System.out.println(i2);
            }
        }
    }
}
