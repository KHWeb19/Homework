public class Homework3 {
    public static void main(String[] args) {
       //1,1,1,2,3,4,6,9,13,19,28,41,60,88,129...
        //25번째 항을 구하라..
        //first second third (first + third)
        //      first second third


        final int START = 3;
        final int END = 25;

        int result = 0,i;
        int first= 1;//1번쨰 항
        int second =1;//2번째 항
        int third =1;//3번째 항

        for(i = START; i < END; i++ ){
            result = first + third;
            first = second;
            second = third;
            third = result;

            System.out.printf("%d번째 항 = %d\n" , i+1 , result);
        }









    }

}
