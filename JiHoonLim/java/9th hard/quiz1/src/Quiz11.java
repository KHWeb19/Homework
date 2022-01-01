public class Quiz11 {
    final int MAX =122;
    final int MIN =65;


    int range, rand;
    boolean condition;

    public void initQuiz11(){
        range = MAX - MIN + 1 ;

        putQuiz11();
        printQuiz11();

        condition = rand > 90 && rand < 97;
    }

    public void putQuiz11(){
        rand = (int)(Math.random() * range + MIN);

    }

    public void printQuiz11() {
        if (condition) {
            System.out.println("원하는 숫자가 아닙니다");
        } else  {
            System.out.println("65 ~ 90 또는 97 ~ 122 사이 랜덤값  " + rand);
        }
    }
}

