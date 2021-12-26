public class WhileTest {
    public static void main(String[] args) {
        boolean isEven = false;
        int num = 1;

        while (!isEven) {
            num += (int)(Math.random() *2 +1);

            if (num % 2 ==0){
                isEven = true;

            }
            System.out.println("num = "+num);
        }

        //예제2
        int i = 0;
        while(i++ <10){
            System.out.println("i = " +i)        ;
        }
    }
}
