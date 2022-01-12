public class M9Class {
    int start;
    int end;

    int range;

    int[] seqArr;
    int sum;

    public M9Class(final int start, final int end) {
        this.start = start;
        this.end = end;

        range = end - start + 1;
        seqArr = new int[range];
    }

    public void createSequence() {
        for (int i = start - 1; i < end; i++) {
            seqArr[i] = i + start;
        }
    }

    public void printCondition(int condition) {
        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % 2 == condition) {
                System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
            }
        }
    }

    public int findAndSum(int find) {
        sum = 0;

        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % find == 0) {
                sum += seqArr[i];
            }
        }

        return sum;
    }

    public void printRandomCondition(final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;

        int rand = (int) (Math.random() * range + randStart);

        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % rand == 0) {
                System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
            }
        }
    }

    public void printRandomTravel(final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;

        int rand;

        for (int i = start - 1; i < end; i += rand) {
            rand = (int) (Math.random() * range + randStart);

            System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
        }
    }

    public void printRandomTimesTravel(final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;

        int rand, tmp = 0;
    }
}