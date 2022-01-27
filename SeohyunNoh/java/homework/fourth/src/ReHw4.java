public class ReHw4 {
    public static void main(String[] args) {
        // 첫날 숙제를 받았을 땐 점수를 임의로 만드는게 어떤 의미인지 몰랐지만
        // 랜덤값 할당하는 것과 동일하게 랜덤으로 추출하면 되는 거였음
        final int STUDENT = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int[STUDENT];

        int range = MAX - MIN + 1;
        int sum = 0;

        for(int i = 0 ; i < STUDENT ; i++){
            // 랜덤으로 점수 추출
            score[i] = (int)(Math.random() * range + MIN);

            System.out.printf("score[%d]의 점수 : %d\n", i, score[i]);
            sum += score[i];
        }
        System.out.printf("평균점수 : %d\n", sum/STUDENT);
    }
}
