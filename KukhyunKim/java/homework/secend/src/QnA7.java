public class QnA7 {
    public static void main(String[] args) {
        int ran;

        //무한반복
        while(true){
            ran=(int)(Math.random()* 58 + 65);

            if(65 <= ran){
                if(ran <= 90){
                    System.out.printf("rand: %c(%c)\n", ran, ran);

                }
            }
            if (97 <= ran) {
                if (ran <= 122) {
                    System.out.printf("rand: %c(%d)\n", ran, ran);
                }
            }
        }
    }
}
