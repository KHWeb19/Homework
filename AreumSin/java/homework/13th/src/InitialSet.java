public class InitialSet {

    int[] InitArr;
    int bias;
    int length;
    int jumping;
    int temp;

    int[] seqArr;

    public InitialSet(final int[] arr, int bias) {
        length = arr.length;
        this.InitArr = arr.clone();
        this.bias = bias;
    }

    public InitialSet(final int[] arr, int bias, int jumping) {
        length = arr.length;
        this.InitArr = arr.clone();
        this.bias = bias;
        this.jumping = jumping;
    }

    public void InitAdd(){
        for(int i = 0; i < length; i++){
            seqArr[i] = InitArr[i];
        }
    }

    public int getNthOrderData(int count){
        seqArr = new int[count];

        InitAdd();

        System.out.println(length);

        for(int i = length; i < count; i++){
            temp = 0;
            for( int j = length; j > bias; j--){
                seqArr[i] += seqArr[i - j];
                //temp += seqArr[i - j];
                j -= jumping;
            }

            //seqArr[i] = temp;
            System.out.printf("seqArr[%d] = %d\n",i,seqArr[i]);
        }

        return seqArr[count-1];
    }
}
