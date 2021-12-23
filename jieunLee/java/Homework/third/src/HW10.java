public class HW10 {
    public static void main(String[] args) {
        System.out.println("10. 1 ~ 100까지의 숫자를 순회한다.\n" +
                "9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.\n" +
                "다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고\n" +
                "이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!\n");
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<=100; i++) {
            int rand = (int)(Math.random()*9+2);
            sum1 += rand;
            sum2 += sum1;
            System.out.println("2 ~ 10 만큼 이동: " + sum1);
        }
        System.out.println("총합: " + sum2);
    }
}
