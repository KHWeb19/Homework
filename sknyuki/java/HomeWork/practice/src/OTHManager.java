public class OTHManager {
    private final int MIN;
    private final int MAX;
    int range;
    int sum;

    public OTHManager(int MIN, int MAX) {
        this.MAX = MAX;
        this.MIN = MIN;
        range = (MAX - MIN) + 1;
    }
    public int random() {
        return (int) (Math.random() * range + MIN);
    }
    public void multiple(int mark) {
        for (int i = 0; i < MAX; i++) {
            if (i % mark == 0) {
                System.out.println(i + "는" + mark + "의 배수입니다.");
            }
        }
    }
    public int multipleSum(int markSum) {
        sum = 0;
        for (int i = 0; i < MAX; i++) {
            if (i % markSum == 0) {
                sum+=i;
            }
        }
        return sum;
    }
}