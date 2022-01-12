public class HW09 {
    public static void main(String[] args) {
        // 9. 1~100까지의 숫자를 순회한다.
        // 2~10사이의 랜덤한 숫자를 선택후 그 숫자의 배수를 출력
        // 다음 루프에서 다시 랜덤숫자를 선택하고 해당 숫자의 배수를 출력

        int realResult = 0;

        for(int i=1; i<=100; i++){

            int choice = (int) (Math.random() * 9 + 2);
            System.out.printf("%d회차. 추첨된 랜덤 숫자: %d\n", i, choice);
            int result = 0;
            for(int j =1; j<=100; j++) {
                if (j % choice == 0){
                    System.out.printf("%d ", j);
                    result += j;
                }
            }
            System.out.printf("\n%d회차 결과값: %d\n", i, result);
            realResult += result;
        }
        System.out.println("\n최종 결과값: " + realResult);
    }
}
