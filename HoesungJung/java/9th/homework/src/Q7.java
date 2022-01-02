import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        grade g;
        g = new grade();

        final int StuNum = 5;
        int arr [] = new int [StuNum];

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(int i=0;i<StuNum;i++) {
            arr[i] = i + 1;
            //학생[i]번의 정보
            System.out.printf("학생[%d]\n", arr[i]);
            //학생의 수학 점수 입력
            System.out.print("수학 점수를 입력하세요.");
            g.Math = sc.nextInt();
            System.out.println("수학 점수: " + g.Math);
            //학생의 영어 점수 입력
            System.out.print("영어 점수를 입력하세요.");
            g.Eng = sc.nextInt();
            System.out.println("영어 점수: " + g.Eng);
            //학생의 국어 점수 입력
            System.out.print("국어 점수를 입력하세요.");
            g.Kor = sc.nextInt();
            System.out.println("국어 점수: " + g.Kor);
            System.out.println();
            sum1 += g.Math;
            sum2 += g.Eng;
            sum3 += g.Kor;
        }
        System.out.println();
        float avg1 = sum1/StuNum;
        float avg2 = sum2/StuNum;
        float avg3 = sum3/StuNum;
        System.out.println();
        System.out.println("수학 평균 : "+avg1);
        System.out.println("영어 평균 : "+avg2);
        System.out.println("국어 평균 : "+avg3);

        System.out.println();

        //이게 과연 제대로 구해지는 건지 모르겠습니다...!
        double var1 = Math.pow((g.Math-avg1),2)/StuNum;
        double var2 = Math.pow((g.Eng-avg2),2)/StuNum;
        double var3 = Math.pow((g.Kor-avg3),2)/StuNum;

        System.out.println("수학 분산 : "+var1);
        System.out.println("영어 분산 : "+var2);
        System.out.println("국어 분산 : "+var3);

        System.out.println();
        //그래서 이것도 제대로 구해지는 건지 모르겠습니다..!
        double stDe1 = Math.sqrt(var1);
        double stDe2 = Math.sqrt(var2);
        double stDe3 = Math.sqrt(var3);

        System.out.println("수학 표준편차 : "+stDe1);
        System.out.println("영어 표준편차 : "+stDe2);
        System.out.println("국어 표준편차 : "+stDe3);
        }
    }
    class grade{
        int Math;
        int Eng;
        int Kor;
    }

