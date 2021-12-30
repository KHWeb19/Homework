//4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
//
//   힌트: Math.sqrt() - 루트 계산


public class Home5 {
    public static void main(String[] args) {
        int num = 30;                    // 학생수
        int[] score = new int[num];      // 점수배열
        int sum = 0;                     // 총점을 저장하기 위한 변수
        double dev = 0;                  // 분산, 표준편차를 위해 편차변수 설정
        double devSqvSum = 0;            // 편차제곱합
        double average;                  // 평균을 저장하기 위한 변수
        double var;                      //분산
        double std;                      //표준편차
        final int MIN = 60;              // 60점 이상
        final int MAX = 100;             // 100점까지
        final int range = MAX - MIN + 1; //범위

        for(int i = 0; i < num; i++){
            int rand = (int)(Math.random() * range + MIN); //60이상 임의의 점수
            score[i] = rand;
            System.out.println("학생들의 점수 : " + score[i]);
            sum += score[i];
        }
        average = sum / num;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);

        for (int i = 0; i < num; i++) {
            dev = (score[i] - average);                // 편차
            devSqvSum += dev*dev;                      // 편차제곱합에 누적시킴
        }

        var = devSqvSum / num;                         // 분산 도출
        std = Math.sqrt(var);                          // 표준편차 도출

        System.out.print("\n평균:" + average + "\n분산:" + var + "\n표준편차:" + std ); // 평균, 분산, 표준편차 출력

        }
    }

