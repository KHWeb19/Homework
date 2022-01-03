import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Date;

public class Q05 {
    public static void main(String[] args) {

        // 5. 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //    힌트: Math.sqrt() - 루트 계산

        final int MAX = 100; final int MIN = 60; final int RANGE = MAX - MIN + 1; // 점수 랜덤 생성

        final int STUDENT = 30; // 반 학생이 30명이 있다. > 30으로 지정
        int result = 0;
        int randscore;

        int[] StudentScore;
        StudentScore = new int[STUDENT]; // 길이 자체를 30으로 지정

        for (int i=0; i<STUDENT; i++){ // i가 0에서 30까지 1씩 증가하면

            randscore = (int)(Math.random()*RANGE+MIN);
            StudentScore[i] = randscore;
            result += StudentScore[i];

        }
        //System.out.println(Arrays.toString(StudentScore));
        final double AVERAGE = (double) result / 30;
        //System.out.printf("학급 평균은 %f입니다.\n", AVERAGE);

        // 표준편차와 분산

        // ★★★ 질문
        // 4번에서 뽑아낸 평균값의 합을 []에 지정하는 방법으로 해보고싶은데 오류가 납니다.
        // 이런 방법은 못쓰는건가요?

        final int[] AVERAGE2 = StudentScore;

        int[] AVERAGE3 = new int[1];
        int sum = 0;

        for (int i=0; i<AVERAGE; i++) {
            sum += AVERAGE3[i];
            double var = (double) sum; //AVERAGE3; // 분산
            double sd = Math.sqrt(var); // 표준편차

            System.out.println("분산값: " + var);
            System.out.println("표준편차값: " + sd);
        }
        }




    }

