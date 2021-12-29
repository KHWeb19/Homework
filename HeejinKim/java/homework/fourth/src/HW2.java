public class HW2 {
    public static void main(String[] args) {
        //피보나치수열

        int first= 1;
        int second=1;
        int result =0;
        int i;

        final int START = 2;
        final int  END  = 20;

        //배열은 0,1,2부터 시작한다
        // 첫번째 항과 두 번째 항의 값은 1로 고정되어 있기 때문에 세 번째 항부터 시작해야 한다
        // 컴퓨터에서 배열의 시작은 0, 반복 시작을 0을 기준으로 맞춰야 한다> 초기값 2가 의미하는 것은 결국 세 번째 항
        //결국 저 start와 end 과정은 저 result를 생성하는 과정의 숫자

        for(i=START;i<END;i++) {
            result = first + second;
            first = second;
            second = result;
        }

        System.out.printf("20번째 항= %d",result);



    }
}
