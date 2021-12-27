public class Homework7 {
    public static void main(String[] args) {
        //1~ 100까지 숫자중 4의 배수의 합

        final int START = 1;
        final int END = 100;
        final int DECISION = 4;// DECISION 무슨 의밀까
        final int REMAIN = 0;
        int sum = 0;

        for(int i = START ; i <= END; i++){

            if(i % DECISION == REMAIN) {
                sum += i;


            }

        }
        System.out.println("4의 배수의 합 = " + sum);

    }
}




