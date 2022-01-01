public class Quiz3 {

    final int MAX =6;
    final int MIN =1;

    int range, rand1, rand2;

    public void initQuiz3(){
        range = MAX - MIN + 1 ;

        putQuiz3();
        printQuiz3();
    }

    public void putQuiz3(){
        rand1 = (int)(Math.random() * range + MIN);
        rand2 = (int)(Math.random() * range + MIN);
    }

    public void printQuiz3(){
        System.out.println("첫 랜덤값 " +rand1);
        System.out.println("두번째 랜덤값 " +rand2);
    }
}
