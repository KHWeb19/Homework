public class M7Class {
    private int Max;
    private int rangeMax;
    private int rangeMin;
    int range;
    int rand;

    public M7Class(int Max, int rangeMax, int rangeMin) {
        int sum = 0;
        this.Max=Max;
        this.rangeMax=rangeMax;
        this.rangeMin=rangeMin;

        range = rangeMax - rangeMin + 1;
    }
    public void random() {
        rand = (int) Math.random() * range + rangeMin;
    }

    public void start() {
    random();
        for (int i = 0; i <= Max; i++) {
            if (i%rand == 0) {
                System.out.printf("%d는 %d의 배수입니다\n", i, rand);
            }
        }
    }
}
    //2~10사이의 랜덤 숫자를 추출해내고 0~100까지의 배수들 구하기
