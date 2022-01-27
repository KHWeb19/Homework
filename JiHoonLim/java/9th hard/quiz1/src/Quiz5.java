public class Quiz5 {
    final double MAX =1000;
    final double MIN =100;

    double range, rand1, rand2;

    public void initQuiz5(){
        range = MAX - MIN + 1 ;

        putQuiz5();
        printQuiz5();
    }

    public void putQuiz5(){
        rand1 =  (Math.random() * range + MIN);
        rand2 =  (Math.random() * range + MIN);
    }

    public void printQuiz5(){
        System.out.println("첫 랜덤값 " +rand1);
        System.out.println("두번째 랜덤값 " +rand2);
    }
}


