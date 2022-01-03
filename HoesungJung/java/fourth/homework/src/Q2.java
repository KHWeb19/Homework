public class Q2 {
    public static void main(String[] args) {
        //첫, 둘째 수를 더하면 셋째 수가 됨.
        //후 둘째 수가 첫째수가 되고, 셋째 수가 둘째 수가 됨.
        //계속해서 반복.
        int first = 1;
        int second = 1;
        //셋째 수 초기화
        int result = 0,i;
        //i가 여기서 쓰이는 이유는??

        //출력 범위 설정
        final int MIN = 2;
        final int MAX = 20;

        //루프 생성
        for(i=MIN;i<MAX;i++){
            //첫,둘,셋 째 수 초기화.
            result = first+second;
            first = second;
            second = result;
        }
        System.out.printf("%d\n번째 %d\n",i,result);
    }
}
