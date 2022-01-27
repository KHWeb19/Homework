public class Quiz8 {
    final int START = 1;
    final int END = 100;

    final int MAX = 10;
    final int MIN = 2;
    final int REMAIN = 0;

    int i, range, rand;

    public void initQuiz(){
        range = MAX - MIN + 1;

        putQuiz();
    }

    public void putQuiz() {
        rand = (int) (Math.random() * range + 2);

        for (i = START; i <= END; i++) {
            if (i % rand == REMAIN) {
                printQuiz();
            }
        }
    }
    public void printQuiz(){
        System.out.printf("%d ~ %d 사이의 선택한 수 %d의 배수 %d\n", START, END, rand, i);
    }
}
