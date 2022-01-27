public class SequenceGenerator {
    int start;
    int end;

    int range;
    int[] seqArr;
    int sum;
    //2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다

    public SequenceGenerator(final int start, final int end) {
        this.start = start;
        this.end = end;

        range = end - start + 1;
        seqArr = new int[range];//0으로 초기화를 시켜줌,범위만 넣어줌
    }
    public void creatSequence() {//seqArr[i] 안에 값을 넣어주는 메소드
        for (int i = start - 1; i < end; i++) {

            seqArr[i] = i + start;
        }
    }
    public void printCondition(int condition) {
        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % 2 == condition) {

                System.out.printf("seqArr[%d]=%d\n", i, seqArr[i]);
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

    public void printRandomCondition(final int randStart, final int randEnd) {   //final int start라고 적어주면 위에 있는 값과 같아져서
        // 이 메서드의 값이 위의 값을 덮어씌움... 그래서 다른 값으로 명명해줌
        int range = randEnd - randStart + 1;
        int rand = (int) (Math.random() * range + randStart);

        for (int i = start - 1; i < end; i++) {
            if (seqArr[i] % rand == 0) {
                System.out.printf("seqArr[%d]=%d\n", i, seqArr[i]);
            }
        }
    }

    public void printRandomTravel(final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;
        int rand;

        for (int i = start - 1; i < end; i += rand) {
            rand = (int) (Math.random() * range + randStart); // 매번 변경해야되기 때문에 for문 안으로 들어가게 됨
            System.out.printf("seqArr[%d] = %d\n", i, seqArr[i]);
        }
    }

    public void printRandomTimesTravel(final int randStart, final int randEnd) {
        int range = randEnd - randStart + 1;
        int rand, tmp = 0;

        for (int i = start - 1; i < end; i += rand) {
            rand = (int) (Math.random() * range + randStart);
            if (seqArr[i] % rand != 0) {

                tmp = (seqArr[i] / rand + 1) * rand - seqArr[i];

                i += tmp;
            }
            if (i < 100) {
                System.out.printf("rand = %2d, seqArr[%2d] = %2d\n", rand, i, seqArr[i]);
            }
        }
    }
}







