public class StudentOperation {
    /*
    1. 평균, 분산, 표준편차 관리 클래스
     */


    private float sum, avg, var, stand;

    public void initOp(){
        sum = 0 ;
        var = 0 ;
        stand = 0 ;

        systemInit();
        printScore();

    }

    public void systemInit(){
        for (int i =0; i < StudentClass.classNum; i++ ){
            sum += StudentClass.score[i];
        }
    }

    public void avgScore(){
        avg = sum / StudentClass.classNum;
    }

    public void varScore(){
        sum = 0 ;
        for (int i =0; i < StudentClass.classNum; i++){
            sum += Math.pow(StudentClass.score[i] - avg, 2);
        }
        var = sum / StudentClass.classNum;
    }

    public void standScore(){
        stand = (float) Math.sqrt(var);
    }

    public void printScore(){
        avgScore();
        System.out.println("평균은 " +avg);

        varScore();
        System.out.println("분산은 " +var);

        standScore();
        System.out.println("표준편차는 " +stand);
    }
}
