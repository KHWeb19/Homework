public class P05 {
    // 30명이있음
    // 60점 미만 없음(최대값 100)
    // 학생들의 점수를 임의로 배치하고
    // 표준편차, 분산을 구함
    public static void main(String[] args) {
        final int CLASS = 30;
        final int MIN = 60;
        final int MAX = 100;
        float sum = 0;
        float var = 0;

        int range = MAX - MIN + 1;
        int[] arr= new int[CLASS];

        for(int i = 0; i < CLASS; i++){ // 평균값 구하기
            int rand = (int)(Math.random()*range) + MIN;
            arr[i] = rand;
            sum += arr[i];
        }
        float average = sum/CLASS;

        for (int i = 0; i < CLASS; i++){ // 분산 구하기
            arr[i] -= average;
            var += Math.pow(arr[i],2); // Math.pow(a,b) = a^b ---- a가 음수일때 a^b를 계산하면 음수가나옴!!
        }
        System.out.printf("\n분산 : %f, 표준편차 : %f", var/CLASS, (float)Math.sqrt(var/CLASS));
    }
}
