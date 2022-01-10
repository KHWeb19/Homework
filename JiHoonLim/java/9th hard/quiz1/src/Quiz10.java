public class Quiz10 {
    final int MAX1 =90;
    final int MIN1 =65;
    final int MAX2 =122;
    final int MIN2 =97;

    int range1, range2, rand1, rand2;

    public void initQuiz10(){
        range1 = MAX1 - MIN1 + 1 ;
        range2 = MAX2 - MIN2 + 1 ;

        putQuiz10();
        printQuiz10();
    }

    public void putQuiz10(){
        rand1 = (int)(Math.random() * range1 + MIN1);
        rand2 = (int)(Math.random() * range2 + MIN2);
    }

    public void printQuiz10(){
        System.out.println("65 ~ 90 사이 랜덤값  " +rand1);
        System.out.println("97 ~ 122 사이 랜덤값  " +rand2);
    }
}
