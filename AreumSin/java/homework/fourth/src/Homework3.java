public class Homework3 {
    public static void main(String[] args) {
        //1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ..
        // 25번째 항을 구하여라.
        // 규칙 1: (n)항 + (n +2)항 -> (n +3)항
        // 규칙 2: n + (n+1) + (n+2) -> (n+3)항

        // 규칙 1

        final int START = 3;
        final int END = 25;

        int num1 = 0;
        int num2 = 1; // 첫번쨰
        int num3 = 1; // 두번째

        int result = 0, sum = 0;

        for (int i = START; i <= END; i++){
            result = num1 + num3;
            num1 = num2;
            num2 = num3;
            num3 = result;
            System.out.printf("%d번째 %d\n",i,result);
        }

        System.out.println("마지막 항 : "+result);

    }
}
