public class Quiz6 {
    final int DIVISION = 3;
    final int START = 1;
    final int END = 100;
    final int REMAIN = 0;
    int i;

    public void initQuiz(){

        putQuiz();
    }

    public void putQuiz(){
        for (i = START; i <= END; i++){
            if (i % DIVISION == REMAIN){
                printQuiz();
            }
        }
    }
    public void printQuiz(){
        System.out.printf("%d ~ %d 사이의 %d의 배수 %d\n", START, END, DIVISION, i);
    }
}
