public class Homework08 {
    public static void main(String[] args) {
        // 2 ~ 10 사이의 랜덤한 숫자를 선택
        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;
        int random = (int)(Math.random() * range + MIN);
        System.out.println("== " + random + "의 배수 ==");

        // 이 숫자의 배수를 출력
        for (int i = 1; i <= 100; i++){
            if (i % random == 0) {
                System.out.println(i);
            }
        }
    }
}
