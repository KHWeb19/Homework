// 문제은행[4] - 9. 7번 문제에서 분산을 구해봅시다.
// 분산에서 필요한것 = 합, 평균
/*
public class HW9 {
    private float sum;
    private float average;

    public void initCalculate(){
        sum = 0 ;
        average = 0 ;

        for (int i =0; i < HW6.classNum; i++ ){
            sum += HW6.score[i];
        }
        averageScore();
        System.out.println("평균 : " +average);
    }

    public void averageScore(){
        average = sum / HW6.classNum;
    }
    public void varianceScore() {
        sum = 0;
        for (int i = 0; i < HW6.classNum; i++) {
            sum += Math.pow(HW6.score[i] - average, 2);
        }
    }
}
 */