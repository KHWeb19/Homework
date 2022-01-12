public class StudentManage {
    //학생 클래스의 평균, 분산, 표준 편차를 계산

    private float sum, avg, var, sdev;

    public void initMa() {
        sum = 0;
        avg = 0;
        var = 0;
        sdev = 0;

        for (int i = 0; i < Student.subjectNum; i++) {
            sum += Student.score[i];
        }

        avg();
        System.out.println("평균 = " + avg);

        var();
        System.out.println("분산 = " + var);

        sdev();
        System.out.println("표준 편차 = " + sdev);
    }

    public void avg() {
        avg = sum / Student.subjectNum;
    }

    public void var() {
        for (int i = 0; i < Student.subjectNum; i++) {
            sum += Math.pow(Student.score[i] - avg, 2);
        }
        var = sum / Student.subjectNum;
    }

    public void sdev() {
        sdev = (float) Math.sqrt(var);
    }
}





