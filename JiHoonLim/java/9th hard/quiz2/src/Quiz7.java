public class Quiz7 {
    final int DIVISION = 4;
    final int START = 1;
    final int END = 100;
    final int REMAIN = 0;
    int i, sum;

    public void initQuiz(){
        sum = 0;

        putQuiz();
        printQuiz();
    }

    public void putQuiz() {
        for (i = START; i <= END; i++) {
            if (i % DIVISION == REMAIN) {
                sum += i;
            }
        }
    }

    public void printQuiz(){
        System.out.printf("%d ~ %d 사이의 %d의 배수의 합은 %d\n", START, END, DIVISION, sum);
    }

}
