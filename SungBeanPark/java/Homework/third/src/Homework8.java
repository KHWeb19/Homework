public class Homework8 {
    public static void main(String[] args) {
        // 1 ~ 100까지 숫자를 순회환다.
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다
        int min = 2;
        int max = 10;
        int rand = (int)(Math.random()* (max - min + 1) + min);
        System.out.println("랜덤숫자 = " + rand);
        for (int i = 1; i <= 100; i++) {
            if (i % rand == 0) {
                System.out.println("배수 출력 = " + i);
            }
        }
    }
}
