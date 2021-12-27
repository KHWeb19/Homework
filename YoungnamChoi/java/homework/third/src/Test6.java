public class Test6 {
    public static void main(String[] args) {

        // 1~100 까지 수를 for로 지정 후
        // 3의 배수는 i를 3으로 나누었을 때 0 이라고 표현
        for(int i =1; i<=100; i++){
            if( i %3 == 0){
                System.out.println("3의 배수 = " +i);
            }

        }

    }
}
