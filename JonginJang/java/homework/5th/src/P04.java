import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
/*4. 반 학생이 30명이 있다.
     이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
     이 상태에서 학생들의 점수를 임의로 배치하고
     학급의 평균값을 구해보도록 한다.
 */
        Scanner scan = new Scanner(System.in);
        float inputScore = 0.0f;
        final int START = 0;
        final int END = 30;
        float scoreSum = 0.0f;
        // 4번은 30명의 성적을 직접 입력하도록 구현했음


        float classScore[] = new float[END];
        for(int i=START;i<END;i++){
            System.out.printf("%d번째 학생의 성적을 입력해주세요. : ",i+1);
            inputScore = scan.nextFloat();
            if((inputScore>=60)&&(inputScore<=100)) {
                classScore[i] = inputScore;
                System.out.printf("%d번째 학생의 성적 = %.2f\n", i + 1, classScore[i]);
                scoreSum += classScore[i];
            }
            else{ //60~100 사이의 점수가 아닌 경우 재입력
                System.out.println("60~100 사이의 점수를 입력하세요");
                i--;
            }

        }
        System.out.printf("입력받은 %d명의 학생들의 성적의 평균은 %.2f입니다.\n",END,scoreSum/END);
    }
}
