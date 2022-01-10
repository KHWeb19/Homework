public class TwoSquaredManager {
    //
    int [] array;
    public TwoSquaredManager(int num){
        array=new int[num];
        for(int i=0; i<num; i++){
            array[i]=(int)Math.pow(2,i);
            //제곱 구하는식 Math.pow(밑항,제곱근)
            System.out.printf("%d의 제곱의 값은 %d이다\n",i,array[i]);
        }
    }
}
