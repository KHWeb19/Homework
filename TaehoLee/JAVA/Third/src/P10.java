public class P10 {
    // 1. 1 ~ 100 순회,
    // 2. 2 ~ 10 랜덤 숫자
    // 3. 랜덤한 숫자가 나온만큼 이동
    // 4. 출력된 숫자들의 합

    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        int rand;
        int i = START;
        int sum = 0;

        while(i <= END){
            rand = (int)(Math.random() * range) + MIN;
            System.out.printf("현위치 : %d, 출력 값 : %d\n",i, rand);
            sum += i + rand;
            i += rand;
        }
        System.out.println("\n루프 숫자들의 합 : " + sum);
    }
}
