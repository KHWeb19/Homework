public class Quiz13 {
    //int 변수 2개에 랜덤값을 할당하고 출력

    static final int MAX = 100;
    static final int MIN = 1;

    static int range, num1, num2;

    public static void initQuiz13(){
        range = MAX - MIN +1;

        setQuiz13();
    }

        public static void setQuiz13(){
            num1 = (int)(Math.random() * range + MIN);
            num2 = (int)(Math.random() * range + MIN);

            printQuiz13();
        }

        public static void printQuiz13(){
        System.out.println("ranint1 = " + num1);
        System.out.println("ranint2 = " + num2);
    }

}
