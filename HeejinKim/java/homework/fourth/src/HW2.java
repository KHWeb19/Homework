public class HW2 {
    public static void main(String[] args) {
        //피보나치수열

        int first= 1;
        int second=1;
        int result =0;
        int i;

        final int START = 2;
        //반복 시작을 0부터 해서 start2는 결국 3번쨰
        //1+1 하고난 다음의 1+2의 차례의 식이 2번째 부터라 2라고 적은것아닌가?

        final int  END  = 20;

        for(i=START;i<END;i++) {
            result = first + second;
            first = second;
            second = result;
        }

        System.out.printf("20번째 항= %d",result);



    }
}
