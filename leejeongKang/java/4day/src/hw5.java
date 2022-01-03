public class hw5 {
    public static void main(String[] args) {
        final int MIN = 60, MAX = 100, range = (MAX-MIN) +1;  ////난수값 설정
        final int student = 30;



        ///// 시간 부족해서 못했어요. 어렵지 않아서 설명 안해주셔도 될것 같습니다




        int [] arr = new int [student];
        int sum = 0; //합, 평균토탈
        float avg=0, var=0, std=0, dev=0;
        // 평균, 분산, 표준편차, 편차제곱합

        float a=0, b=0, c=0;
        for (int i=0 ; i < arr.length; i++){
            arr [i] = (int)(Math.random()*range + MIN);

            System.out.printf("학생%d : %d점\n", i+1, arr[i]);

            sum+= arr[i];
            avg = (float)sum / (float)student;
            a = (arr[i]-avg);
            b +=a;
            c += Math.pow(b, 2);


        }

        for (int j = 0; j < arr.length; j++) {
            dev = (arr[j] - avg); // 편차를 구하고,
            dev += Math.pow(dev, 2); // 편차제곱합에 누적시킴
        } // end for

        //*var = devSqvSum / intArr.length; // 분산 도출
        //std = Math.sqrt(var); // 표준편차 도출

        ////*
        avg = (float)sum / (float)student;

        System.out.println("총합 : " + sum);
        System.out.println("평균값 : " + avg);
        System.out.println("표준편차 : " + b);
        System.out.println("분산 : " + c);
        System.out.println("분산 : " );
    }
}
