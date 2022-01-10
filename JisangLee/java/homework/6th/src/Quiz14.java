public class Quiz14 {
    //float 변수 2개에 랜덤값을 할당하고 출력

    static final float MAX = 100;
    static final float MIN = 1;

    static float range, num1, num2;

    public static void initQuiz14() {
        range = MAX - MIN + 1;

        setQuiz14();
    }

    public static void setQuiz14() {
        num1 = (float) (Math.random() * range + MIN);
        num2 = (float) (Math.random() * range + MIN);

        printQuiz14();
    }

    public static void printQuiz14() {

        System.out.println("ranfloat1 = " + num1);
        System.out.println("ranfloat2 = " + num2);
    }
}
