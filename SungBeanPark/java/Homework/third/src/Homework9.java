public class Homework9 {
    public static void main(String[] args) {
        // 1~100까지의 숫자를 순회한다.
        // 2~10사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        // 다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        // 그 다음 루프에서 다시 작업을 반복한다.
        // 끝까지 순회 했을 때 출력된 숫자들의 합은 얼마인가?
        int sum = 0;
        int min = 2;
        int max = 10;
        int rand = (int)(Math.random()* (max - min + 1) + min);
        System.out.println("랜덤숫자 = " + rand);

        for (int i = 1;  i<= 100; i++) {
            if (i % rand == 0) {
                sum += i;
                System.out.printf("%d 배수: %d\n", rand, i);
                }
            }
        System.out.println("합 = " + sum);
    }
}
