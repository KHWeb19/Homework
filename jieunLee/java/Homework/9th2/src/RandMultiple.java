public class RandMultiple {
    final int START = 1;
    final int END = 100;
    final int MIN = 2;
    final int MAX = 10;
    final int REMAIN = 0;
    int decision;
    int sum = 0;

    public void randMultiple() {
        decision = (int)(Math.random()*(MAX-MIN+1)+MIN);
        for (int i=START; i<END; i++) {
            if (i%decision==REMAIN) {
                System.out.println(i);
            }
        }
    }
    public void randMultiple2() {
        boolean allocRand = false;
        for (int i=START; i<END; i++) {
            while (!allocRand) {
                decision = (int)(Math.random()*(MAX-MIN+1)+MIN);
                allocRand = true;
            }
            if (i%decision==REMAIN) {
                System.out.printf("%d의 배수 %d\n", decision, i);
                sum += i;
                allocRand = false;
            }
        }
        System.out.println("총합: "+sum);
    }
    public void randMultiple3() {
        for (int i=START; i<END; i+=decision) {
            decision = (int)(Math.random()*(MAX-MIN+1)+MIN);
            System.out.printf("%d에서 %d이동\n", i, decision);
            sum += i;
        }
        System.out.println("총합: "+sum);
    }
}
