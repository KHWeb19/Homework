public class Homework4 {
    public static void main(String[] args) {

        //구구단 7단
        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        System.out.printf("====구구단 %d단====\n", STAGE);

        for(int i = START; i < END; i++){

            System.out.printf("%d X %d = %d\n" , STAGE, i , STAGE*i);
         }
    }
}



