public class Homework07 {
    public static void main(String[] args) {

        // 회사에 직원이 7명이 있습니다.
        // 모두 입사동기로 3500만원으로 시작하였다고 합니다.
        // 각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        // 이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        final int MAX = 10;
        final int MIN = 1;
        int range = MAX - MIN +1;

        final int YEAR = 6; // 인덱스 0의 값은 처음 연봉의 값을 설정하기 때문에 6으로 한다.
        final int PERSON = 5;

        int [] salary = new int[YEAR];
        int [] person = new int[PERSON];

        salary[0] = 3500;

        // 사람의 수도 배열에 따라 배치하고, 연봉의 값도 랜덤하게 배열에 따라 배치하기 위해
        // 두번 배열값을 쓴다.

        for(int p = 0; p < PERSON; p++){

            // 사람의 숫자를 1부터 쓰기 위해 +1을 해준다
            person[p] = p+1;

            for (int i = 1; i < YEAR ; i++) {

                // 연봉 인상 랜덤 Math.random()
                // num은 인상 분
                int rand = (int)(Math.random() * range + MIN);
                int num = (int)(0.01 * rand * salary[i - 1]);

                salary[i] = salary[i - 1] + num;

                System.out.printf("%d의 %d년 후의 %d퍼센트 상승한 연봉 : %d\n", person[p], i, rand, salary[i]);

            }

            System.out.println();

        }
    }
}
