public class HW09 {
    public static void main(String[] args) {
        System.out.println("9. 1~100까지 숫자를 순회한다.\n" +
                "2~10사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.\n" +
                "다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.\n" +
                "그 다음 루프에서 다시 작업을 반복한다.\n" +
                "끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가?\n");
        int sum = 0;
        for (int i=1; i<=3; i++) {
            int rand = (int)(Math.random()*9+2);
            for (int num=1; num<=100; num++) {
                if (num % rand == 0) {
                    sum += num;
                    System.out.printf("%d의 배수: %d\n", rand, num);
                }
            }
        }
        System.out.printf("총합: %d\n", sum);
    }
}
