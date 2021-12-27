public class Q9 {
    public static void main(String[] args) {

        //    1 ~ 100까지의 숫자를 순회한다.
        //    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //    그 다음 루프에서 다시 작업을 반복한다.
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가?

        // TIP
        // 1.for문 사용
        // 2.for문 내부에서 2~10의 난수 출력
        // 3.난수의 배수를 검사하기 전까지 랜덤을 다시 생성X

        final int start = 1; final int end = 100; final int remain = 0;
        final int max = 10; final int min =2;

        int range = max - min + 1;

        boolean isRandomAllocCheck = false;
        int decision = 0;
        int sum = 0;

        // * sum : 두개의 값(int a, int b)을 받으며 리턴값은 두 개의 입력값을 더한 값(int 자료형)이다.
        // * boolean : 참 또는 거짓의 값을 갖는 자료형, 대입되는 값은 참 또는 거짓만 가능하다.

        for (int i = start; i <= end; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + min);
                isRandomAllocCheck = true;
            }

            // * while문
            // 조건식이 참인 수행문을 수행하고 다시 조건식을 검토해서 참이라면 수행을 반복한다.
            // !isRandomAllocCheck일 경우에 난수를 출력하고 맞을경우 출력을 멈춘다.


            if (i % decision == remain) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;

                sum += i;
            }
        }

        System.out.println("현재까지 나타난 숫자들의 합 = " + sum);

    }
}
