public class hw5 {
    public static void main(String[] args) {
        final int MIN = 60, MAX = 100, range = (MAX-MIN) +1;  ////난수값 설정
        final int student = 30;

        ///// 분산 = (모든평균 - 점수값)^2/sum

        int [] arr = new int [student];
        int sum = 0; //합
        float avg=0;
        double var; // 분산
        float dev; // 표준편차
        float std=0; // 편차 값의 제곱

        for (int i=0 ; i < arr.length; i++){
            arr [i] = (int)(Math.random()*range + MIN);

            System.out.printf("학생%d : %d점\n", i+1, arr[i]);
            sum+= arr[i];
            avg = (float)sum/(float)student;
        }

        for ( int j =0; j<student; j++){
            float a = avg - arr[j];
            System.out.printf("%.1f\n", a);
            std += (double) Math.pow((a),2);
        }
        var = std /student;
        dev = (float) Math.pow(var,0.5);

        System.out.println("총합 : " + sum);
        System.out.println("평균값 : " + avg);
        System.out.println("분산 : " + var);
        System.out.println("표준편차 : " + dev);

    }
}
