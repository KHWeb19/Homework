public class Quiz4 {
    final float MAX =100;
    final float MIN =10;

    float range, rand1, rand2;

    public void initQuiz4(){
        range = MAX - MIN + 1 ;

        putQuiz4();
        printQuiz4();
    }

    public void putQuiz4(){
        rand1 = (float) (Math.random() * range + MIN);
        rand2 = (float) (Math.random() * range + MIN);
    }

    public void printQuiz4(){
        System.out.println("첫 랜덤값 " +rand1);
        System.out.println("두번째 랜덤값 " +rand2);
    }
}

