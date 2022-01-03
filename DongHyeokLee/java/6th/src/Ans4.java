public class Ans4 {
    public static void main(String[] args) {
        //반 학생이 30명이 있다.
        //이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //이 상태에서 학생들의 점수를 임의로 배치하고
        //학급의 평균값을 구해보도록 한다.

        // 30명 모두 60점 이상
        // 점수 임의로 배치 << 60점이상 랜덤으로 배치 60~ 100점
        // 30명의 점수 평균값

        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN +1;

        //final int START = 0;
        //final int END = 30;
        final int STUDENT_NUM = 30; // 변수명을 변경함으로써 무엇을 나타내는지 명확해짐
        //int[] student = new int[END];
        int[] score = new int[STUDENT_NUM];
        // 아직 무엇을 배열을 만들지 잘 모르겠음 학생을 배열화 시켜서 학생 순서를 생각했는데 그냥 점수에 넣으면
        // 인덱스 0번부터가 자연스럽게 학생 번호로 매기면 되느거 같음


        int sum = 0;


       // for(int num = START; num < END; num++)
        for(int i = 0; i < STUDENT_NUM; i++){
            //int score = (int)(Math.random()*range+MIN);
            //student[num] = score;
            score[i] = (int) (Math.random() * range + MIN); // score를 배열화 시킴으로써 코드가 간단해짐

            sum +=score[i];
        }
        //avg = sum/END;

        System.out.println("반 평균값 = " + (float) (sum) / STUDENT_NUM); // 평균 값이니 소수점이 나오는걸 생각못했음 그래서 float추가해야함

    }
}
