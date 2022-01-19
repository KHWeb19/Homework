public class SquaredAndSum implements Runnable {
    final static float BASIC = 0.001f;
    private float squaredStanderd; // 이걸 3으로 해서, 0~3만큼 제곱할 수 있도록 한다.
    //3000번동안 +0.001씩 더하기 // 그 값을 제곱 // 배열에 값 모두 입력 // 마지막 값을 도출해 낸다. (2.9999* 2.9999= 9언저리쯤)
    private int count;
    private float squaredArr[];

    public SquaredAndSum(int squaredStanderd) {
        this.squaredStanderd = squaredStanderd;
        count = (int) (squaredStanderd / BASIC) + 1; // 3천번 반복하는 카운트 체크 완료 /
        squaredArr = new float[count];

    }

    public void splitNumber() {
        float sum = 0;
        for (int i = 0; i < count; i++) {
            sum += BASIC;
            squaredArr[i] = sum;
        }
    }

    @Override
    public void run() {
        try {
            splitNumber();
            float multy =0;
            for(int i=0 ; i < count ; i++){
                multy = (float) (Math.pow(squaredArr[i],2));
                System.out.printf("squaredArr[%d] = %.4f,, 제곱 값 = %.3f\n",i,squaredArr[i],multy);

                Thread.sleep(5);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

