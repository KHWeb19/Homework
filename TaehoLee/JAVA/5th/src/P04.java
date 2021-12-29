public class P04 {
    // 30명이있음
    // 60점 미만 없음(최대값 100)
    // 학생들의 점수를 임의로 배치하고
    // 평균값을 구함
    public static void main(String[] args) {
        final int CLASS = 30;
        final int MIN = 60;
        final int MAX = 100;
        float sum = 0; // sum값을 float변수로 넣어야 최종값이 float로 나옴!!

        int range = MAX - MIN + 1;
        int[] arr= new int[CLASS];

        for(int i = 0; i < CLASS; i++){
            int rand = (int)(Math.random()*range) + MIN;
            arr[i] = rand;
            sum += arr[i];
            System.out.printf("%d 번째 학생의 점수 : %d\n", i + 1, rand);
        }
        System.out.printf("\n학생들의 시험 평균값 : %f", sum/CLASS);
    }
}
