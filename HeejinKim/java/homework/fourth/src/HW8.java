public class HW8 {
    public static void main(String[] args) {
        /*1 ~ 100까지 숫자를 순회한다.

        2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.*/


        //1.100까지
        //2.랜덤생성
        //3.배수 출력>>>for문 안에 if절로 나머지 0을 사용해서

        final int START = 1;
        final int END = 100;

        final int MIN = 2;
        final int MAX = 10;

        final int REMAIN = 0;

        int range = MAX - MIN + 1;
        int decision = (int) ((Math.random() * range) + MIN);//랜덤생성

        for (int i = START; i <= END; i++) {//100까지 순회
            if ( i % decision == REMAIN) {
                System.out.println(i);
            }


        }
    }
}
