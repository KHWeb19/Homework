public class SequenceGenerator {

    int[] arr;
    int start;
    int end;

    int initStart;
    int initEnd;
    int range;

    int tmp;
    int sum = 0;

    public void initSeq(int initStart, int initEnd){
        this.initStart = initStart;
        this.initEnd = initEnd;

        arr = new int[initEnd];

        for(int i = initStart-1; i< initEnd; i++){
            arr[i] = i + initStart;
        }
    }

    public void evenNum(int num){
        for(int i = initStart-1; i < initEnd; i++){

            if(arr[i] % num == 0){
                System.out.printf("arr[%d] = %d\n", i, arr[i]);
            }
        }
    }

    int resutl;
    public void findNumAdd (int num){
        resutl = 0;
        for(int i = initStart -1; i < initEnd; i++){
            if(arr[i] % num == 0) {
                resutl += arr[i];
                System.out.printf("arr[%d] = %d\n", i, arr[i]);
            }
        }
        System.out.println(resutl);
    }

    public void numTravel(int start, int end){
        range = end - start +1;

        for(int i = initStart -1; i < initEnd; i+=sum){
            sum = (int)(Math.random()*range + start);
            System.out.printf("랜덤값 : %d, seqArr[%d] = %d\n", sum, i, arr[i]);
        }
    }

    public void numTravelNine(int start, int end){
        range = end - start +1;

        tmp = 0;
        for(int i = start-1; i < end; i++){
            sum = (int)(Math.random()*range + start);
            if(i % sum != 0){
                tmp += (arr[i] / sum + 1) * sum - arr[i];
                i += tmp;
            }

            if (i < 100) {
                System.out.printf("rand = %2d, seqArr[%2d] = %2d\n", sum, i, arr[i]);
            }
        }

    }
}
