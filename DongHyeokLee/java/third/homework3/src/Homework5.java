public class Homework5 {
    public static void main(String[] args) {
        //1~ 100까지 숫자중 짝수만 출력

        final int START = 1;
        final int END = 100;
        final int DECISION = 2;// DECISION 무슨 의밀까
        final int REMAIN = 0; // REMAIN 나머지


        for(int i = START; i <= END; i++){

            if(i % DECISION == REMAIN){
                System.out.printf("짝수 i = %d\n", i);
            }
        }


    }
}
