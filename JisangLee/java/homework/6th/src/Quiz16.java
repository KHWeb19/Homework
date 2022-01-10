public class Quiz16 {
    //주사위 2개를 굴려서 눈금의 합

    static final int MAX = 6;
    static final int MIN = 1;

    static int range, dice1, dice2, dice3;

    public static void initQuiz16(){
        range = MAX - MIN +1;

        setQuiz16();
    }
    public static void setQuiz16(){
        dice1 = (int)(Math.random() * range + MIN);
        dice2 = (int)(Math.random() * range + MIN);
        dice3 = dice1 + dice2;

        printQuiz16();
    }
    public static void printQuiz16(){
        System.out.println("주사위1 = " + dice1);
        System.out.println("주사위2 = " + dice2);
        System.out.println("주사위1 + 주사위2 = " + dice3);
    }
}
