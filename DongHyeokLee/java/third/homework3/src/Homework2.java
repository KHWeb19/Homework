public class Homework2 {
    public static void main(String[] args) {
        //1 ,1 , 2 , 3 ,5 ,8 ,13,21,34,55,89...
        // 0번째 1번쨰 2번째...
        //일명 피보나치 수열의 20번째 항을 구하도록 프로그래밍


        final int END = 20;
        final int START = 2;
        int result = 0,i ; //
        int first= 1;//1번쨰 항
        int second =1;//2번째 항


        //first second result
        //       first second
        //               first second
            for(i = START; i < END; i++){

                result = first + second;
                first = second;
                second = result;

                System.out.printf("%d번째 항 : %d\n", i+1, result);
            }

        System.out.printf("%d번째 항 : %d\n" , i ,result);



    }
}











