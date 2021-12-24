public class P3 {
    // 1,1,1,2,3,4,6,9,13,19,28,41,60,88,129 규칙의 25번째 항

    public static void main(String[] args) {
        int res = 0;
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;

        final int count = 25;

        for(int i = 3; i < count; i++) {
            res = num1 + num3;
            num1 = num2;
            num2 = num3;
            num3 = res;
        }
        System.out.println("규칙의 25번째 항 : " + res);
    }
}
