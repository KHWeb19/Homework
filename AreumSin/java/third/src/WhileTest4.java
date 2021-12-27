public class WhileTest4 {
    public static void main(String[] args) {
        int i =0;

        while ( i< 30){

            i++;

            if ( i % 5 == 0){
                System.out.printf(" i는 5의 배수 = %d\n", i);
            }
        }
    }
}
