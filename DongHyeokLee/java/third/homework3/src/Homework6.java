public class Homework6 {
    public static void main(String[] args) {
        // 1~100까지 숫자중 3의 배수만 출력

        final int START = 1;
        final int END = 100;
        final int DECISION = 3;// DECISION 무슨 의밀까
        final int REMAIN = 0; // REMAIN 나머지


        for(int i = START; i <= END; i++){

            if(i % DECISION == REMAIN){
                System.out.printf("3의 배수 i = %d\n", i);
            }
        }



        }
    }

