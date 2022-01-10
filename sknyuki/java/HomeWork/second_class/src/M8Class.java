public class M8Class {
    private int Max;
    private int rangeMax;
    private int rangeMin;
    int range;
    int rand;

    public M8Class(int Max, int rangeMax, int rangeMin) {
        int sum = 0;
        this.Max=Max;
        this.rangeMax=rangeMax;
        this.rangeMin=rangeMin;

        range = rangeMax - rangeMin + 1;
    }
    public void random() {
        rand = (int) (Math.random() * range + rangeMin);
    }

    public void start() {
        random();
        int sum=0;
        for (int i = 0; i <= Max; i++) {

            if (i%rand == 0) {
                sum+=i;
                System.out.printf("%d는 %d의 배수이며 이들의 합은%d입니다\n", i, rand,sum);
            }
        }
    }
}

