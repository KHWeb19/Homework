public class ReHw7 {
    public static void main(String[] args) {
        // 1~100중
        // 4+8+12+16+...+100 의 값 구하기

        final int START = 1;
        final int END = 100;

        final int DECISION = 4;
        final int REMAIN = 0;

        int sum = 0;

        for(int i = START; i <= END ; i++){
            if(i % DECISION == REMAIN){
                sum += i;
            }
        }
        System.out.printf("%d의 배수의 합 : %d\n", DECISION, sum);
    }
}
