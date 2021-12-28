public class Homework5 {
    public static void main(String[] args) {
        /*
        5. 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        힌트: Math.sqrt() - 루트 계산
         */

        /*
        1. 60~89 30개의 엘리먼트의 평균값 74.5에서 해당 인덱스 값을빼서 양수화시킴
        2.
         */
        final int MAX = 30;
        int[] arr = new int[30];


        for (int i = 0; i < MAX; i++) {
            arr[i] = i + 60;

            /*
             합을구하는 코드?? 구글 검색했는데 이해는못하고 그냥써봤는데 실행은 안됨..
             int scoreCal() {
                 int hap = int[i]arr;
                 return hap;
             }
             double std1() {
                double avg = scoreCal(i) / 30.0;
                double dis = Math.pow((i - avg), 2);
	            double dis1 = Math.pow((i+1 - avg), 2);
	            double dis2 = Math.pow((i+3 - avg), 2);
	            double dis3 = Math.pow((i+4 - avg), 2);
	            double dis4 = Math.pow((i+5 - avg), 2);
	            ....
	            30?
	            double var = (dis + dis1 + dis2 +... dis29 + dis30) / 30;
	            std = Math.sqrt(var);
	            return std;
	            }
                간결하게 표현할수 있는 수식이있을텐데.. 맞는지도 모르겠다 일단 실행은 안됨.
            */
            System.out.printf("%d번째 학생 점수 = %d\n", i + 1, arr[i]);
        }
    }
}

