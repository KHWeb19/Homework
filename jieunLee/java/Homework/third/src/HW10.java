public class HW10 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MIN = 2;
        final int MAX = 10;
        System.out.printf("10. %d ~ %d까지의 숫자를 순회한다.\n" +
                "9번과 유사하게 %d ~ %d을 가지고 작업을 진행한다.\n" +
                "다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고\n" +
                "이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!\n", START, END, MIN, MAX);
        int rand, sum = 0;
        for (int i=START; i<END; i+=rand) {
            rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
            System.out.printf("%d ~ %d 만큼 이동: %d\n", MIN, MAX, i);
            sum += i;
        }
        System.out.println("총합: " + sum);
    }
}
