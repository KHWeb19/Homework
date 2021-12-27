public class Homework10 {
    public static void main(String[] args) {
        /* 일단 for문을 사용 이동한 위치를 1 부터 100까지 선언해야 한다
        여기서 난수와 이동한 위치를 더해주어야 되기 떄문에 for 마지막문 i++를 i += decision? 으로 사용
        Math.random으로 범위를 지정 그리고 그결과 값을 for문에 저장해주어야 되기 떄문에 1+= decision 으로 이동?
        그리고 sum 변수만들어주고 for문에 sum+= i사용 그리고 for문 빠져나와 전부더한합출력
         */
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;


        int decision = 0;
        int sum = 0;


        for (int i = START; i <= END; i += decision) {

            decision = (int) (Math.random() * range + MIN);

            System.out.printf("뽑은 난수 = %d, 현재 이동한 위치 = %d\n", decision, i);


            sum += i;
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}