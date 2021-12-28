public class Num7 {
    public static void main(String[] args) {
        /*
        회사에 직원이 7명이 있습니다.
        모두 입사동기로 3500만원으로 시작하였다고 합니다.
        각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.
         */
        /*
        배열은 우선 7명으로 측정한다.
        랜덤값으로 각 값에 퍼센트를 출력한다. 1~10퍼는 0.01~0.1
        5년후니까 for 반복을 다섯번 해주면서 더해주면 될듯??
         */

        final double MAX = 0.1;
        final double MIN = 0.01;
        double range = MAX - MIN;
        int rand = 0;
        int salary = 3500;

        final int YEAR = 5;
        final int COWORKER = 7;
        int sum = 0;
        double []arr = new double[COWORKER];

        // 7명이 5년동안 받아야하는 값 -> FOR(5년동안) 7명의 값. 매년마다 연봉이 오를테니 sum을 하는게 맞는듯
        // 7명의 덧셈을 각각 해줘야하는데 어떻게 하지
        for(int i=0;i<YEAR;i++){
            for(int j=0;j<COWORKER;j++) {
                rand = (int) (Math.random() * range + 3500);
                arr[i] = (int) (salary + rand);
                salary += rand;
                System.out.printf("%d년째 %d 직원 연봉 %f\n", (i+1),(j + 1), arr[i]);

                //여기서 각 배열 별로 덧셈을 해야할 것 같은데..
            }
        }
    }
}
