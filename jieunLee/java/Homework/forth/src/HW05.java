public class HW05 {
    public static void main(String[] args) {
        //1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다.
        final int MIN = 1;
        final int MAX = 20;
        final int DECISION = 2;
        final int REMAIN = 0;
        int i = MIN;
        while (i++<MAX) {
            if (i%DECISION==REMAIN) {
                System.out.println(i);
            }
        }
    }
}
