public class Quiz7 {
    final int MAX =6;
    final int MIN =1;

    int range, dice1;

    public void initQuiz7(){
        range = MAX - MIN + 1 ;

        putQuiz7();
        printQuiz7();
        evenQuiz7();
    }

    public void putQuiz7(){
        dice1 = (int)(Math.random() * range + MIN);
    }

    public void printQuiz7(){
        System.out.println("첫 주사위 " +dice1);
    }

    public void evenQuiz7() {
        if (dice1 % 2 == 0) {
            System.out.println("당첨");
        } else {
            System.out.println("홀수");
        }
    }
}

