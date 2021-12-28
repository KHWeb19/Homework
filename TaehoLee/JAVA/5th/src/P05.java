public class P05 {
    // 30명이있음
    // 60점 미만 없음(최대값 100)
    // 학생들의 점수를 임의로 배치하고
    // 표준편차, 분산을 구함
    public static void main(String[] args) {
        final int CLASS = 30;
        final int MIN = 60;
        final int MAX = 100;
        int sum = 0;
        double var = 0;

        int range = MAX - MIN + 1;
        int[] arr= new int[CLASS];

        for(int i = 0; i < CLASS; i++){ // 평균값 구하기
            int rand = (int)(Math.random()*range) + MIN;
            arr[i] = rand;
            sum += arr[i];
        }
        for (int i = 0; i < CLASS; i++){ // 분산 구하기
            arr[i] -= sum/CLASS;
            var += arr[i]^2;
        }
        System.out.printf("\n분산 : %f, 표준편차 : %f", var/CLASS, Math.sqrt(var/CLASS));
    }
}
