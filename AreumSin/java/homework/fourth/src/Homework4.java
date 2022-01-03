public class Homework4 {
    public static void main(String[] args) {
        //4. 구구단 7단을 출력해보자!

        final int START = 1;
        final int END = 9;

        final int NUMBER = 7;

        for (int i = START; i <= END; i++){
            System.out.printf("%d * %d = %d\n",NUMBER, i, NUMBER*i);
        }
    }
}
