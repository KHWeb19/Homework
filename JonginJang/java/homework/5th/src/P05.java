import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
/*5. 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
   힌트: Math.sqrt() - 루트 계산
   표준편차 : 분산에 루트
   분산: 각 편차들(값과 평균치의 차이)들을 제곱한 다음 더해주고 전체 숫자로 나눈다.  */
    //5번은 4번과 다르게 학생들의 성적을 난수로 처리했음
        Scanner scan = new Scanner(System.in);
        //5번은 입력이 아닌 60~100점 사이의 난수발생으로 점수 입력
        final int START = 0;
        final int END = 30;

        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN +1;  // 1 ~ 100 중의 난수를 발생시킬것

        int randScore = 0;
        int scoreSum = 0;
        int scoreAvg = 0;
        int classScore[] = new int[END];

        int deviArr[] = new int[END];
        int deviation = 0;
        int deviSum = 0;
        int deviSumAvg = 0; //분산
        int standevi = 0; //표준편차

        for(int i=START;i<END;i++){
            randScore = (int)(Math.random()*range+MIN);
            classScore[i] = randScore;
            System.out.printf("%d번째 학생의 성적 = %d\n", i + 1, classScore[i]);
            scoreSum += classScore[i];
            }
        scoreAvg = scoreSum/END;
        System.out.printf("입력받은 %d명의 학생들의 성적의 총합은 %d,평균은 %d입니다.\n",END,scoreSum,scoreAvg);
        System.out.println("==========================================================================");

        for(int j=START;j<END;j++){
            deviation = classScore[j] - scoreAvg;
            System.out.printf("%d번째 학생의 성적은 %d점으로 평균인 %d점과 %d점 차이가 납니다.\n",j+1,classScore[j],scoreAvg,deviation );
            deviArr[j] = (int)Math.pow(deviation,2);
            System.out.printf("%d번째 편차 = %d, 편차의 제곱 = %d\n", j + 1, deviation, deviArr[j]);
            deviSum += deviArr[j];
        }
        deviSumAvg = deviSum / END ;
        System.out.printf("각각의 편차의 제곱들의 합 = %d, 분산 = %d\n",deviSum, deviSumAvg);
        standevi = (int)Math.sqrt(deviSumAvg);
        System.out.println("표준편차 = " + standevi);

    }

    }

