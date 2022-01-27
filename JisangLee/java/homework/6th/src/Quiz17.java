public class Quiz17 {
    //주사위를 굴려서 짝수인 경우 당첨

    static final int MAX = 6;
    static final int MIN = 1;

    static int range, dice;

    public static void initQuiz17() {
        range = MAX - MIN + 1;

        setQuiz17();
    }

    public static void setQuiz17() {
        dice = (int) (Math.random() * range + MIN);

        printQuiz17();
    }

    public static void printQuiz17() {
        if (dice % 2 == 0) {
            System.out.println("주사위 = " + dice);
            System.out.println("당첨입니다!");
        } else {
            System.out.println("꽝입니다!");

        }
    }
}

