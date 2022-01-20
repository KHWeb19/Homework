public class HW03 {
    public static void main(String[] args) {
        //숫자 3이 짝수인지 홀수인지 판별하는 코드를 작성해봅시다!
        final int NUM = 3;
        final int DECISION = 2;
        final int REMAIN = 0;
        if (NUM%DECISION==REMAIN) {
            System.out.printf("%d은(는) 짝수입니다.", NUM);
        } else {
            System.out.printf("%d은(는) 홀수입니다.", NUM);
        }
    }
}
