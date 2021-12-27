public class Hw9 {
    //1 ~ 100까지 숫자를 순회, 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력
    //다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력
    //그 다음 루프에서 다시 작업을 반복
    //끝까지 순회했을 때 출력된 숫자들의 합
    public static void main(String[] args) {
        int i;
        int rand;
        int sum = 0;
        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;
        rand = (int) (Math.random() * range + MIN);
        System.out.println("랜덤한 숫자: " + rand);
        for (i = 0; i < 101; i++) {
            if (i % rand == 0) {
                    System.out.printf("%d의 배수 = %d\n", rand, i);
                    sum +=i;
            }
        }
        System.out.println("숫자들의 합 = " + sum);
    }
}




