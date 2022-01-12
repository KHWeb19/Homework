public class HW4 {
    public static void main(String[] args) {

        //fianl 사용
        final int STAGE = 7;
        final int START = 1;
        final int END=10;


         for (int i=1;i<END;i++){
             System.out.printf("%dx%d=%d\n",STAGE,i,STAGE*i);
         }
    }
}
