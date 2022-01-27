import java.util.Arrays;

public class Student {
    //반 학생이 30명이 있다.
    //이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
    //이 상태에서 학생들의 점수를 임의로 배치하고
    //학급의 평균값을 구해보도록 한다.

    //반 학생 배열
    // 점수 범위 60~ 100 임의 배치
    // 평균값

    final int SCORE_MAX = 100;
    final int SCORE_MIN = 60;


    int student_num;
    int range = SCORE_MAX - SCORE_MIN + 1;
    int sum = 0;
    float avg , var ,stdDev;

    int[] score;


    public Student(final int student_num){
         this.student_num = student_num;

        score = new int[student_num];

        Average();
        Variance();
        StdDev();
    }

    public void Average(){
        for(int i = 0; i < student_num; i++){
            score[i] = (int)(Math.random() * range + SCORE_MIN);

            sum += score[i];
        }

        avg = sum/student_num;
    }

    public void Variance(){

        for (int i = 0; i < student_num; i++) {
            var += Math.pow(score[i] - avg, 2);
        }

        var /= student_num;
    }

    public void StdDev () {
        stdDev = (float) Math.sqrt(var);
    }

    @Override
    public String toString() {
        return "Student{" +
                "avg=" + avg +
                ", var=" + var +
                ", stdDev=" + stdDev +
                '}';
    }
}
