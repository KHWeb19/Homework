public class hw7 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;
        final int range = (MAX-MIN)+1;
        final int staff = 7;

        float [] arr = {3500, 3500, 3500, 3500, 3500, 3500, 3500};
        double percent=0;

        for (int i=1; i<6; i++){
            System.out.printf("\n\n========================%d년차 직원 연봉=======================\n",i);
            for (int j=0; j< staff; j++){
                System.out.printf("직원%d번 : ", j+1);
                int rand = (int)(Math.random()*range+MIN);
                System.out.print("연봉상승률="+rand+"%  ");

                percent = (arr [j] * rand * 0.01);
                arr[j] +=  percent;

                System.out.printf("연봉상승값= %.1f만원  ",percent);
                System.out.printf("최종연봉 : %.1f만원\n",arr[j]);

        }}

    }
}
