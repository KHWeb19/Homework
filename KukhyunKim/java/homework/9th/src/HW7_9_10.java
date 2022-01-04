public class HW7_9_10 {
    // 7. 평균
    // 9. 분산
    // 10. 표준편차

    private float sum, average, variance, deviation;

    public void initOp(){
        sum = 0 ;
        average = 0 ;
        deviation = 0 ;
        for (int i =0; i < HW6.classNum; i++ ){
            sum += HW6.score[i];
        }
        avgScore();
        System.out.println("평균 : " + average);
        varScore();
        System.out.println("분산 : " + variance);
        standScore();
        System.out.println("표준편차 : " + deviation);
    }
    public void avgScore(){
        average = sum / HW6.classNum;
    }
    public void varScore(){
        sum = 0 ;
        for (int i =0; i < HW6.classNum; i++){
            sum += Math.pow(HW6.score[i] - average, 2);
        }
        variance = sum / (HW6.classNum-1);
    }
    public void standScore(){
        deviation = (float) Math.sqrt(variance);
    }
}