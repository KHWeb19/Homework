public class Quiz8 {
    final int MAX =6;
    final int MIN =1;

    int range, dice1;

    public void initQuiz8(){
        range = MAX - MIN + 1 ;

        putQuiz8();
        printQuiz8();
        oddQuiz8();
    }

    public void putQuiz8(){
        dice1 = (int)(Math.random() * range + MIN);
    }

    public void printQuiz8(){
        System.out.println("첫 주사위 " +dice1);
    }

    public void oddQuiz8() {
        if (dice1 % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("손모가지 내놔");
        }
    }
}


