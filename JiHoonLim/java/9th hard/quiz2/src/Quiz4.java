public class Quiz4 {
    final int WANT = 7;
    final int START = 1;
    final int END = 10;
    int i;

    public void initQuiz(){
        System.out.printf("구구단 %d단\n",WANT);

        putQuiz();

    }
    public void putQuiz(){
        for (i = START; i<END; i++){
            printQuiz();
        }
    }
    public void printQuiz(){
        System.out.println(WANT+ " * " +i+ " = " +(WANT*i));
    }
}
