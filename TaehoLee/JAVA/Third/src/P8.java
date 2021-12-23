public class P8 {
    // 1. 1 ~ 100 순회,
    // 2. 2 ~ 10 랜덤 숫자 선택
    // 3. 이 숫자의 배수 출력

    public static void main(String[] args) {
        int rand, num;

        for(num = 1; num <= 100; num++){
            rand = (int)(Math.random() * 10) + 1;
            System.out.printf("%d번째 루프 : %d\n", num, (num * rand));
        }
    }
}
