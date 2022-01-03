public class M9 {
    public static void main(String[] args) {


        /*  1 ~ 100까지의 숫자를 순회한다.
            2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
            다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다. */


        // 1. 1 ~ 100까지 숫자 순회는 for문을 사용
        // 2. for 문 내부에서 랜덤 난수 생성 2 ~ 10
        // 3. 난수의 배수를 검사하기 전까지 랜덤을 다시 생성하면 안됨(while 문 인용)

        // 실제 난수의 할당(생성) 했는지 안했는지 판정 여부
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        boolean isRandomAllocCheck = false;
        //방어 루틴을 위한 boolean 값 설정
        int decision = 0;
        int sum = 0;
        //decision,sum값을 초기화
        for (int i = START; i <= END; i++) {
            //언제까지 루프를 돌릴지 범위 지정
            while (!isRandomAllocCheck) {
                //while 문을 돌리기 위해 boolean값을 true로 설정
                decision = (int) (Math.random() * range + MIN);
                //while 내부에 decision을 위치 시키는것으로 매 루틴 새로운 랜덤 값 부여
                System.out.printf("%d번째 반복\n",i);
                //몇번째 루틴인지 가시화
                isRandomAllocCheck = true;//false로 변경하여 다음 루프로 decision값을 넘겨줌(true인 상태라면 if로 못 넘어가고 while이 무한 반복됨)
            }

            if (i % decision == REMAIN) {
                //if로 조건부여
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;
                // 숫자를 다시 랜덤으로 돌리기위해 true로 변경하여 while부터 다시 실행

                sum += i;
            }

        }
        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);
    }
}