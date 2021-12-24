public class WhileTest {
    public static void main(String[] args) {
        boolean isEven = false;
        boolean isOdd = true;
        int num = 1;

//        while (!isEven) {
        while (isOdd) {

            num += (int) (Math.random() * 2 + 1);

            if (num % 2 == 0) {
//                isEven = true;
                isOdd = false;
            }

            System.out.println("num = " + num);
        }
    }
}