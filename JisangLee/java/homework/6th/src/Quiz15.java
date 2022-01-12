public class Quiz15 {
    //double 변수 2개에 랜덤값을 할당하고 출력

    static final double MAX = 100;
    static final double MIN = 1;

    static double range, num1, num2;

    public static void initQuiz15() {
        range = MAX - MIN + 1;

        setQuiz15();
    }

    public static void setQuiz15() {
        num1 = (double) (Math.random() * range + MIN);
        num2 = (double) (Math.random() * range + MIN);

        printQuiz15();
    }

    public static void printQuiz15() {

        System.out.println("randouble1 = " + num1);
        System.out.println("randouble2 = " + num2);
    }
}
