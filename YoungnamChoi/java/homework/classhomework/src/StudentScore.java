public class StudentScore {
    // 평균 분산 표준편차 를 구하는 클래스
    private int sum;
    private float avg, variance, stand;

    public void initGrade(){

        avg=0;
        variance=0;
        stand=0;
        for(int i =0; i<Grade.CLASS; i++){
            sum+=Grade.score[i];
        }

       avgScore();
        System.out.println("평균: " +avg);

        varianceScore();
        System.out.println("분산: " +variance);

        standScore();
        System.out.println("표준편차: " +stand);
    }
    public void avgScore(){
        avg=sum/Grade.CLASS;
    }
    public void varianceScore(){
        sum =0;
        for(int i=0; i<Grade.CLASS; i++){
            sum+= Math.pow(Grade.score[i]-avg, 2);
        }
        variance=sum/Grade.CLASS;
    }
    public void standScore(){
        stand =(float) Math.sqrt(variance);
    }
}
