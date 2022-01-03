public class hw4 {
    public static void main(String[] args) {
        final int MIN = 60, MAX = 100, range = (MAX-MIN) +1;
        final int student = 30;


        int [] arr = new int [student];
        int sum = 0;
        float avg=0;

        for (int i=0 ; i < arr.length; i++){
            arr [i] = (int)(Math.random()*range + MIN);
            System.out.printf("학생%d : %d점\n", i+1, arr[i]);

            sum+= arr[i];

        }
        avg = sum / (float)arr.length;
        System.out.println("총합 : " + sum);
        System.out.println("평균값 : " + avg);
    }
}
