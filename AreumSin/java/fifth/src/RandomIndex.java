public class RandomIndex {
    public static void main(String[] args) {
        final int MAX = 100;
        final int ARRMAX = 100;
        final int MIN = 50;

        int range = MAX - MIN +1;

        int[] arr = new int[ARRMAX];

        int randIdx = 1;
        int cnt = 1;

        for(; cnt < 10; cnt++){
            randIdx = (int)(Math.random()*ARRMAX);
            arr[randIdx] = (int)(Math.random()*range + MIN);

            System.out.printf("randInx: %d, arr[randInx] = %d\n", randIdx, arr[randIdx]);
        }
    }
}
