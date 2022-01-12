public class Q3 {
    public static void main(String[] args) {
        final int ARRMAX = 100;
        final int MAX = 5;
        final int MIN = 0;
        int range = MAX-MIN+1;

        int [] arr = new int [ARRMAX];

        int randIdx,randIdx2,randIdx3,randIdx4,randIdx5,cnt = 1;

        for(;cnt<6; cnt++){
           randIdx = (int)(Math.random()*ARRMAX);
            randIdx2 = (int)(Math.random()*ARRMAX);
            randIdx3 = (int)(Math.random()*ARRMAX);
            randIdx4 = (int)(Math.random()*ARRMAX);
            randIdx5 = (int)(Math.random()*ARRMAX);
            arr[randIdx] = (int) (Math.random() * range + MIN);

            System.out.printf("당첨 : %d,%d,%d,%d,%d, arr[randIdx]=%d\n",
                    randIdx,randIdx2,randIdx3,randIdx4,randIdx5, arr[randIdx]);

        }

    }//등수를 중복되지 않게 하려면 어떻게 해야하는가..?
}
