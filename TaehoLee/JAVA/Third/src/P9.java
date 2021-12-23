public class P9 {
    // 1. 1 ~ 100 순회,
    // 2. 2 ~ 10 랜덤 숫자 선택
    // 3. 이 숫자의 배수 출력
    // 4. 루프에서 작업반복
    // 5. 출력된 숫자들의 합

    public static void main(String[] args) {
        int sum = 0 , rand, num;

        for(num = 1; num <= 100; num++){
            rand = (int)(Math.random() * 10) + 1;
            System.out.printf("%d번째 루프 : %d\n", num, (num * rand));
            sum += num * rand;
        }
        System.out.println("루프 숫자들의 합 : " + sum);
    }
}
