public class Quiz9 {

    final double MAX =97;
    final double MIN =4;

    double range, rand1;

    public void initQuiz9(){
        range = MAX - MIN + 1 ;

        putQuiz9();
        printQuiz9();
    }

    public void putQuiz9(){
        rand1 = (Math.random() * range + MIN);
    }

    public void printQuiz9(){
        System.out.println("4 ~ 97 사이 랜덤값 = " +rand1);
    }
}
