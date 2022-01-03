import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        // 스캐너를 이용해서 30번쨰 학생까지 칠수 있는 코드만듬
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 성적을 입력하세요.");

        int[] score = new int[30];
        int sum = 0;
        // [i] 번쨰 학생 [i] 1로 계속 올라갈수 있도록 for문사용
        for (int i = 0; i < 30; i++) {

            System.out.printf("[ %d] 번째 학생 성적 :", i + 1);
            score[i] = sc.nextInt();
            //if문을 사용 60점 안넘으면 break 빠져나감
            if(score[i]<61) {
                System.out.println("점수는 60점을 넘겨야한다");
                break;
            }
            //sum을 이용 전체 합구해줌
            sum += score[i];

        }
        //평균값을 실수로 만드는 법을 모르겠습니다.
        System.out.printf("총점수의 합 %d ",sum);
        System.out.printf("총점수의 평균 %d ",sum / 30);

    }
}