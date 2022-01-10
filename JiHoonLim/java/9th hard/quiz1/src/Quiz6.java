public class Quiz6 {
    final int MAX =6;
    final int MIN =1;

    int range, dice1, dice2;
    int sum;

    public void initQuiz6(){
        range = MAX - MIN + 1 ;
        sum =0;

        putQuiz6();
        printQuiz6();
    }

    public void putQuiz6(){
        dice1 = (int)(Math.random() * range + MIN);
        dice2 = (int)(Math.random() * range + MIN);
        sum = dice1 + dice2;
    }

    public void printQuiz6(){
        System.out.println("첫 주사위 " +dice1);
        System.out.println("두번째 주사위 " +dice2);
        System.out.println("두 주사위의 합은 " +sum);
    }
}

