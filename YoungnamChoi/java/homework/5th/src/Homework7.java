public class Homework7 {
    public static void main(String[] args) {

        //회사에 직원이 7명이 있습니다
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        /*
        1. 전체 크기를 7로 선언한다.
        2.연봉 배열을 만들어서 배열의 모든 값을 3500이라고 만든다
        3. 연봉은 매년 1~10로씩 다르므로 최대 최소를 정의해 준다.
        4.오른 연봉의 퍼센트와 오른 연봉을 저장 해주는 배열을 하나 만든다.
        5.이 과정을 5번 반복하는 반복문을 만든다.
         */

        final int SIZE = 7;

        int[] salary = new int[SIZE];

        for(int i =0; i<SIZE; i++){
            salary[i] = 3500;
        }

        final int MIN = 1;
        final int MAX = 10;
        final int RANGE = MAX-MIN+1;

        for (int i=1; i<=5; i++){

            System.out.printf("\n%d년후 연봉상황입니다.\n", i);

            for (int j=0; j<SIZE; j++){
                int salary2 = (int) (Math.random() * RANGE + MIN);
                salary[j] += (int) (salary[j]*(salary2*0.01));
                System.out.printf(" %d의 연봉이 %d퍼센트 올랐습니다. 현재 연봉: %d\n", j+1, salary2, salary[j]);
            }

        }

    }
}