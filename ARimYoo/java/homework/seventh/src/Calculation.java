public class Calculation {

    Student student = new Student();

    // 평균 분산 표준편차들은 소숫점 값을 가질 수 있으니까 데이터 타입 float
    public float sum;
    public float average;
    public float var;
    public float sd;

    // 모든 계산값들을 구하는 메서드
    public void getCalculation (){

        student.setScore();
        average();
        var();
        sd();
        System.out.println("평균 : " + average + " 분산 : " + var + " 표준편차 : "+ sd);

    }

    // 평균값 구하는 메서드
    public void average () {

        for (int i = 0; i < student.subjectnum; i++){
            sum += student.subScore[i];
        }

        average = sum/student.subjectnum;

    }

    // 분산
    public void var () {
        sum = 0;

        for (int i = 0; i < student.subjectnum; i++){
           sum+= (float)(Math.pow(average - student.subScore[i],2));
        }

        var = sum/student.subjectnum;

    }

    // 표준편차
    public void sd () {

        sd = (float)Math.sqrt(var);

    }
}
