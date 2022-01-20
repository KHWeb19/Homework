public class ForSumTest {
    public static void main(String[] args) {
        // sum은 지역 변수로 main 내부에서는 어디든 살아있음.
        // 만약 sum 을 for문 내부에 적으면
        // for문이 끝나는 순간 for문과 함께 소멸함(정보 손실)

        //sum = 0; 실제로 메모리에는 중구난방으로 데이터들이 들어있음.
        // 그렇기 때문에 int sum 이라고 해놓으면
        // 실제로 sum에는 쓰레기 값이 들어있음.
        // 그래서 0을 설정하여 덧셈을 통한 누산을 명확하게 해 줄 필요가 있음.

        int sum=0;

        for(int i=1; i< 101; i++){
            sum += i;

        }

        System.out.println("1~100까지의 합산 = 5050?"+sum);
    }
}
