public class MyCustomSequence {

    InitialSet is;

    public MyCustomSequence(final int[]arr,int bias){
        is= new InitialSet(arr,bias);//받아서 is를 생성함
    }

    public MyCustomSequence (final int[] arr, int bias, int jumping) {
        is = new InitialSet(arr, bias, jumping);
    }

    public int getNthOrderData(int count){
        return is.getNthOrderData(count);
    }







}
