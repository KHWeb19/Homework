public class studentScoreCal {

    public static void avgCal() {                           /////평균 구하기
        int sum=0;
        for (int i = 0; i < student.subjectNum; i++) {
            sum += student.score[i];
        }
        float avg = (float)sum /student.subjectNum;
        System.out.println("평균 점수" + avg);
    }


    public static void varCal() {                           ///////분산 & 표준편차 구하기
        double std=0;
        for (int j=0; j< student.subjectNum; j++){
                float a =  - student.score[j];
                std += (double) Math.pow((a),2);
            }
            double var = std /student.subjectNum;
            double dev = (float) Math.pow(var,0.5);
        System.out.println("분산 : " + var);
        System.out.println("표준편차 : " + dev);
        }

    }
