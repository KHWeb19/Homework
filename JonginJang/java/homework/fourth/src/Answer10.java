public class Answer10 {
    public static void main(String[] args) {
    /*
    - 문제10.  1 ~ 100까지의 숫자를 순회한다.
              9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
              다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
              이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

    - 구현 전략
    1~100까지의 숫자를 순회시키기 위해 for문을 사용한다.
    이동한 값들의 합을 저장시키기 위한 변수인 sum을 선언한다.

    현재 위치값에서 얼마나 이동할지는 매 루프마다 수행되는 난수 발생을 통해 결정
    2~10 사이의 난수를 발생시키기 위해 Math.random()을 이용한다-> (int)(Math.random() * (10-2 +1) + 2))

    - for문 내부 동작
     난수를 발생시키고 이동할 값과 현재 위치값을 출력한다. sum에 현재 위치값을 더한다.

    - 위치값이 100을 넘지 않게 하기 위한 for문 구성
    for (int i = START; i <= END; i += decision)
    for문 내부 동작 후 수행되는 증감식: 현재 위치와 난수의 값을 더해준다.
    증감식 이후 수행되는 조건식 : 현재 위치와 난수의 값이 더해진 값을 끝점인 100과 비교해준다.

    - for문 동작방식
    : 초기값을 가지고 for문 내부동작을 수행한다.
    증감식으로 이동해 현재 위치값에서 선택된 난수의 범위만큼 이동한다.
    이전 위치와 난수의 값이 더해진 i값이 100보다 작거나 같다면 다음 루프 실행하고,
    100보다 크다면 반복이 종료되고 최종 sum의 값을 출력한다.
    */
        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        int decision = 0;
        int sum = 0;

        //final int DEATH = 44;

        for (int i = START; i <= END; i += decision) {
            System.out.println("--------------------------------------------");
            System.out.printf("현재 위치 = %d\n", i);
            decision = (int) (Math.random() * range + MIN);
            System.out.printf("뽑은 난수 = %d\n", decision);
            //System.out.printf("뽑은 난수 = %d, 현재 위치 = %d\n", decision, i);
            /*
            if (i == DEATH) {
                i = START;
            }
             */
            sum += i;
            System.out.println("현재까지 sum = " + sum);
            System.out.println("--------------------------------------------");

        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}