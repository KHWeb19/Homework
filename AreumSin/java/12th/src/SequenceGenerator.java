public class SequenceGenerator {
    int start;
    int end;

    int range;

    int sum;

    int[] seqArr;

    public SequenceGenerator (final int start, final int end){
        this.start = start;
        this.end = end;

        range = end - start +1;
        seqArr = new int[range];
    }
    public void createSequence(){
        for (int i = start -1; i < end; i++){
            seqArr[i] = i + start;
        }
    }

    public void printCondition(int condition){
        for(int i = start -1; i < end; i++){
            if(seqArr[i] % 2 == condition){
                System.out.printf("seqArr[%d] = %d\n",i,seqArr[i]);
            }
        }
    }

    public int findAndSum(int find){
        sum = 0;
        for (int i= start -1; i < end; i++){
            if(seqArr[i] % find == 0){
                sum  += seqArr[i];
            }
        }

        return sum;
    }

    public void printRandomCondition(int rnadStart, int randEnd){
        int range = randEnd - rnadStart +1;
        int rand = (int)(Math.random() * range +start );

        for(int i = start -1; i < end; i++){
            if(seqArr[i] % rand == 0){
                sum  += seqArr[i];
                System.out.printf("seqArr[%d] = %d\n",i,seqArr[i]);
            }
        }
    }

    public void printRandomTravel(int randStart, int randEnd){
        int range = randEnd - randStart +1;
        int rand;

        for(int i = start -1; i < end; i+= rand){
            rand = (int)(Math.random() * range +start );
            System.out.printf("랜덤값: %d, seqArr[%d] = %d\n",rand,i,(seqArr[i] -1));
        }
    }

    public void printRandomTimesTravel(final int randStart, final int randEnd){
        int range = randEnd - randStart +1;
        int rand, tmp;

        for(int i = start -1; i < end; i++){
            rand = (int)(Math.random() * range +start );
            if(seqArr[i] % rand != 0){

                //현재 숫자 근처의 rand로 나눠 떨어지는 숫자를 찾기
                // 현재 숫자 / rand의 몫을 보고 나눠 떨어지지 않으니
                // 여기에 더히기 1 한거에 곱해서 현재값을 뺸 값 만큼 +를 하면 된다.

                /*
                for(int j = rand; i < end; i++){
                    while (j % rand == 0){

                    }
                }
                -> 이렇게 하면 조금 쉽게 가능하지않을까...?
                 */
                tmp = (seqArr[i] / rand +1) * rand - seqArr[i];
                i+= tmp;
            }
            if(i < 100) {
                System.out.printf("랜덤값: %3d, seqArr[%2d] = %d\n",rand,i,seqArr[i]);
            }
        }
    }
}
