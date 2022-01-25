public class StudentOperation {
    private float sum, avg, var, stand;

    public void initOp(){
        sum = 0 ;
        var = 0 ;
        stand = 0 ;
        for (int i =0; i < StudentClass.classNum; i++ ){
            sum += StudentClass.score[i];
        }
        avgScore();
        System.out.println("평균은 " +avg);
        varScore();
        System.out.println("분산은 " +var);
        standScore();
        System.out.println("표준편차는 " +stand);
    }
    public void avgScore(){
        avg = sum / StudentClass.classNum;
    }
    public void varScore(){
        sum = 0 ;
        for (int i =0; i < StudentClass.classNum; i++){
            sum += Math.pow(StudentClass.score[i] - avg, 2);
        }
        var = sum / (StudentClass.classNum-1);
    }
    public void standScore(){
        stand = (float) Math.sqrt(var);
    }
}