public class HW3 {

    public static void main(String[] args) {

        int first=1;
        int second=1;
        int third=1;
        int result=0;
        int i;

        final int START=3;
        final int  END=25;
        // 점화식의 n>=3번째 부터와 같은 상황

        for(i=START;i<END;i++){
            result=first+third;
            first  = second;
            second = third;
            third  = result;


        }

        System.out.printf("25번째 항의 값:%d",result);


        }
    }
