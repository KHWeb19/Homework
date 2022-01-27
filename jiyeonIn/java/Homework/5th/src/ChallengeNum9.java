public class ChallengeNum9 {
    public static void main(String[] args) {
        //9. 1~100까지의 숫자를 순회, 2~10 사이의 랜덤 숫자 선택, 숫자 배수 출력
        //다음 루프에서 다시 랜덤숫자 선택, 해당 숫자 배수 출력~ 다음작업 다시 반복
        //끝까지 순회했을때 출력된 숫자들의 합은 얼마인가?

        // 1. 1 ~ 100 을 순회한다. (순차 순회할 필요는 없다) - 방어 루틴 안쓸거라 \
        // -> 순차 순회란 무슨뜻일까 아무튼 1~100을 순회하려면 for문으로 작성해야한다.
        // 2. 루프 내에서 난수 값을 할당 받는다.
        // -> 매 순회마다 난수의 값이 달라지기 위해
        // 3. 현재 i값이 난수의 배수인지 판정한다.
        // -> if문으로 배수 판정하기.
        // 4. 배수라면 출력하고 sum에 합산 -> if문 내에 sum+=i 추가하기
        //    아니라면 i에 가장 가까운 i 보다 큰 난수(랜덤) 배수값을 찾아서 출력하고 합산한다.
        //    -> else 추가 / else안에서 for문 한번 더! continue를 해줘서 rand 값이 변동되지 않고 숫자가 순환 될 수 있게 해준다.
        //    또한 현재 i 값은 랜덤값의 배수가 아니므로 출력한 값으로 i값을 갱신한다.
        //    -> ?? 무슨 뜻인지는 잘 모르겠지만 i 값이
        // 5. 다시 루프를 돌면서 위의 작업들을 반복한다면
        //    방어루틴이 없어도 안정된 동작을 보일 것이다.

        final int MAX = 2;
        final int MIN = 10;
        int range = MAX - MIN +1;
        int rand = 0;

        final int START = 1;
        final int END = 100;
        int sum = 0;
        int check = 0;


        for(check =START;check<=END;check++) { //check를 순차적으로 +1 더해줘야 누락없이 rand 와 나누기 할수있음
            rand = (int)(Math.random()*range+MIN);

            if (check % rand == 0) {
                System.out.println(rand + "의 배수 : " + check);
                sum += check;

            } else {
                for (check = check; check <= END; check++) {
                    if (check % rand == 0) {
                        System.out.println(rand + "의 배수 : " + check);
                        sum += check;
                        break;

                    }else {
                        continue; // 이렇게 하면 첫 for문에서 rand값이 변경되지 않는다.
                    }
                }
            }
        }
        System.out.println("출력 합산 : " +sum);
    }
}
