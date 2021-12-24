public class P2 {
    // 피보나치 수열의 20번째 항

    public static void main(String[] args) {
        int res = 0;
        int num1 = 1;
        int num2 = 1;

        final int count = 20;

        for(int i = 2; i < count; i++) {
            res = num1 + num2;
            num1 = num2;
            num2 = res;
            }
        System.out.println("피보나치 20번째 수 : " + res);
    }
}