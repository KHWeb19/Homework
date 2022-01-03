public class Homework4 {
    public static void main(String[] args) {
        /*
        반 학생이 30명이 있다.
        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        이 상태에서 학생들의 점수를 임의로 배치하고
        학급의 평균값을 구해보도록 한다.
         */
        /*
        1. 30개의 배열을 할당하고
        2. 60점 미만은 없으므로 점수는 61~100으로 설정?
        3. 30개의 배열에 점수 상수값을 배치하고
        ----> 점수를 임의로 배치하는걸 어떻게 할까
        4. sum/30으로 평균값 계산하기
         */

        int sum = 0;
        double avg = 0;

        //30개의 점수를 임의로 배치하는 방법을 모르겠어서
        //일단 5개 점수만 직접 입력하여 풀었다
        int[] score = {70, 85, 90, 100, 62};

        for(int i = 0; i < score.length; i++){
            // 총합 계산하기
            sum += score[i];
        }

        avg = sum / score.length;

        System.out.println("평균점수 : " + avg);
    }
}
