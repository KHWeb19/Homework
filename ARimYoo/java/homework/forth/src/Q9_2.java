public class Q9_2 {
    public static void main(String[] args) {

        // 1 ~ 100까지의 숫자를 순회한다.
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        // 다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        // 그 다음 루프에서 다시 작업을 반복한다.
        // 끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

        // 스스로 다시 풀어본 결과

        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;

        int sum = 0;

        // 순회한다 = for문 사용
        for (int i =START; i<END; i++){

            // for문 내부에서 랜덤숫자 선택 Math.random()
            int rand = (int)(Math.random() * range + MIN);

            // 조건을 만족할 시 배수 출력 = if문 사용
            if (i % rand == REMAIN){

                System.out.printf("%d의 배수 : %d\n", rand, i);

                sum += i;

            }


        }
        // 출력된 숫자들의 합
        System.out.println("배수들의 총합 : " +  sum);


        // Q. 이렇게 코드를 짜도 비슷한 결과의 값이 나오는 것 같은데, 이렇게 하면 안되나요?
    }
}
