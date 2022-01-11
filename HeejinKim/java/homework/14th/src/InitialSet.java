public class InitialSet {
    //피보나치 수열의 20번째 항을 구하도록
    int[] initArr;
    int length;
    int bias;
    int jumping;

    int[] seqArr;//사용하는 배열

    public InitialSet(final int[] arr, int bias) {
        length = arr.length;

        this.initArr = arr.clone();
        this.bias = bias;

        jumping=0;
    }


    public InitialSet(final int[] arr, int bias, int jumping) {

        length = arr.length;

        this.initArr = arr.clone();
        this.bias = bias;
        this.jumping = jumping;
    }
    public void initArr() {
        for (int i = 0; i < length; i++) {
            seqArr[i] = initArr[i];
        }
    }

    public int getNthOrderData(int count) {

        seqArr = new int[count];

        initArr();

        int tmp;

        for (int i = length; i < count; i++) {//시작점
            tmp = 0;

            for (int j = length; j > bias; j--) {
                tmp += seqArr[i - j];

                j-=jumping;
            }
            seqArr[i] = tmp;
            System.out.printf("seqArr[%d]=%d\n", i, seqArr[i]);
            }
            return seqArr[count - 1];

        }
    }


