public class try1 {
    // 퀴즈3. 숫자 3이 짝수인지 홀수인지 판별하는 코드
    public static void main(String[] args) {
        final int NUM = 3;
        final int MULTIPLE = 2;
        final int REMAIN = 0;
        if(NUM % MULTIPLE ==REMAIN) {
            System.out.printf("숫자 %d은(는) 짝수다.", NUM);
        }
            else{
                System.out.printf("숫자 %d은(는) 홀수다.", NUM);

        }
    }
}
