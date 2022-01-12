public class ReHw5 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        //곱셈, 나눗셈, 나머지 등등의 연산을 할 때도
        // fianl로 변수 정의하기
        final int DECISION = 2;
        final int REMAIN = 0;

        for(int i = START ; i <= END ; i++ ){
            if(i % DECISION == REMAIN){
                System.out.println(i);
            }
        }
    }
}
