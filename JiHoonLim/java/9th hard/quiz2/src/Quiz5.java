public class Quiz5 {
    final int DIVISION = 2;
    final int START = 1;
    final int END = 100;
    final int REMAIN = 0;
    int i;

    public void initQuiz(){

        putQuiz();
    }

    public void putQuiz(){
        for (i = START; i <=END; i++){
            if (i % DIVISION == REMAIN){
                printQuiz();
            }
        }
    }
    public void printQuiz(){
        System.out.printf("%d ~ %d 사이의 %d의 짝수 %d\n", START, END, DIVISION, i);
    }
}
