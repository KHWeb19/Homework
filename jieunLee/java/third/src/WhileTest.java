public class WhileTest {
    public static void main(String[] args) {
        boolean isEven = false;
        int num = 1;

        while (!isEven) {
            num += (int)(Math.random()*2+1);
            if (num%2==0) {
                isEven = true;
            }
            System.out.println("짝수가 아니면 반복하고 짝수가 되면 종료: " + num);
        }
    }
}
