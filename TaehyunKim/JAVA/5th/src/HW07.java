public class HW07 {

    // 7명 직원, 연봉 3500 시작. 연봉 인상률 매년 1~10%
    // 5년후 받을 연봉에 대한 시뮬레이션

    public static void main(String[] args) {

        final int SIZE = 7;

        int[] salaryArray = new int[SIZE];

        for(int i =0; i<SIZE; i++){
            salaryArray[i] = 3500;
        }

        final int MIN = 1;
        final int MAX = 10;
        final int RANGE = MAX-MIN+1;

        for (int i=1; i<=5; i++){

            System.out.printf("\n%d년후 연봉상황입니다.\n", i);

            for (int j=0; j<SIZE; j++){
                int salaryRaised = (int) (Math.random() * RANGE + MIN);
                salaryArray[j] += (int) (salaryArray[j]*(salaryRaised*0.01));
                System.out.printf("사원 #%d의 연봉이 %d퍼센트 올랐습니다. 현재 연봉: %d\n", j+1, salaryRaised, salaryArray[j]);
            }

        }

    }
}
