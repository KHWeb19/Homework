public class Quiz18 {
    //주사위를 굴려서 홀수가 나오면 손모가지를 내놔라 출력


    static final int MAX = 6;
    static final int MIN = 1;

    static int range, dice;

    public static void initQuiz18() {
        range = MAX - MIN + 1;

        setQuiz18();
    }

    public static void setQuiz18() {
        dice = (int) (Math.random() * range + MIN);

        printQuiz18();
    }

    public static void printQuiz18() {
        if (dice % 2 != 0) {
            System.out.println("주사위 = " + dice);
            System.out.println("손모가지를 내놔라");
        } else {
            System.out.println("손모가지를 살렸습니다!");

        }
    }
}
