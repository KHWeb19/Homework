public class ReHw3 {
    public static void main(String[] args) {
        int thirdPre = 1;
        int secondPre = 1;
        int pre = 1;
        int current = 0;

        final int START = 3;
        final int END = 24;

        for(int i=START ; i <=END ; i++){
            current = thirdPre + pre;

            thirdPre = secondPre;
            secondPre = pre;
            pre = current;

            System.out.printf("%d번째 항 : %d\n", i+1, current);
        }
    }
}
