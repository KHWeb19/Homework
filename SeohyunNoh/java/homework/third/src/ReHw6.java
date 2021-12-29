public class ReHw6 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int DECISION = 3;
        final int REMAIN = 0;

        for(int i=START ; i<=100 ; i++){
            if(i % DECISION == REMAIN){
                System.out.printf("%d의 배수 : %d\n", DECISION, i);
            }
        }
    }
}
