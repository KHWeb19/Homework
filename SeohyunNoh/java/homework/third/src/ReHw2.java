public class ReHw2 {
    public static void main(String[] args) {
        int prePrevious = 1;
        int previous = 1;
        int current;
        int i = 1;

        System.out.printf("%d번째 항 : %d\n", i, prePrevious);
        System.out.printf("%d번째 항 : %d\n", i+1, previous);

        //final로 지정하는 습관을 들이자
        final int START = 2;
        final int END = 20;

        for(i = START ; i <END ; i++){
            current = prePrevious + previous;
            prePrevious = previous;
            previous = current;

            System.out.printf("%d번째 항 : %d\n", i+1, current);
        }

    }
}