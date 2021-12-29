public class problem7 {
    public static void main(String[] args) {
        final int YEAR = 5;
        final int STAFF = 7;
        final int SALARY = 3500;
        final int MAX = 10; final int MIN = 1; int i =1;
        double[] arr = new double [STAFF];
        for(int j = 0; j < STAFF; j++){
            arr[j] = SALARY;
        while(i++ <= YEAR ) {
            int a = (int) (Math.random() * MAX + MIN);
            arr[j] = arr[j] + (arr[j] * a)*0.01 ;
        }
            System.out.printf("직원%d의 5년후 연봉은 %f 입니다.\n",j,arr[j]);
        i=1;

        }

    }
}
