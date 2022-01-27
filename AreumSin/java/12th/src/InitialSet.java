public class InitialSet {
    // 정수형 배열, 길이, 보정치, 점핑

    int[] initArr;
    int length;
    int bias;
    int jumping;

    int[] seqArr;

    int tmp;

    // 1번 케이스
    public InitialSet(final int[] arr, int bias){
        length = arr.length;

        // 배열 내용 복사
        this.initArr = arr.clone();

        this.bias = bias;
    }

    // 2번 케이스
    public InitialSet(final int[] arr, int bias, int jumping){
        length = arr.length;

        // 배열 내용 복사
        this.initArr = arr.clone();
        this.jumping =jumping;

        this.bias = bias;
    }

    public void initArr(){
        for(int i = 0; i < length; i++){
            seqArr[i] = initArr[i];
        }
    }

    public int getNthOrderData(int count){
        seqArr = new int[count];

        initArr();
        /* 현재 구조의 문제점 2개 처리에는 적하하지만 3개 이상 처리는 불가능한 구조
        for(int i = length; i < count; i++){
            seqArr[i] = seqArr[i-1] + seqArr[i-2];
        }
         */

        // 20까지 or 25까지
        // 2 ~ 19 or 4 ~ 24
        for(int i = length; i < count; i++){
            tmp = 0;
            // 0~ 1 or 0 ~2
            // 우리가 맞춰야 하는 조건은 [0] + [1] + [2] = [4]
            //
            for(int j = length; j > bias;  j--){
                // i -j // 4 - 4 + 4 - 3 + 4 - 2
                //         5 - 4 + 5 - 3 + 5 - 2
                tmp += seqArr[i - j];
                j -= jumping;
            }
            seqArr[i] = tmp;
            System.out.printf("seqArr[%d] = %d\n", i, seqArr[i] );
        }

        return seqArr[count -1];
    }
}
