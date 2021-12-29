public class Home5 {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 짝수만 출력해보자.
        final int START = 1;
        final int END = 100;
        final int DECISION = 2;
        final int REAMIN = 0;

        for (int i = START; i <= END; i++)
            if(i%DECISION == REAMIN){
                System.out.printf("1~100까지의 숫자중 짝수만 출력 : %d\n", i);
            }
    }
}
