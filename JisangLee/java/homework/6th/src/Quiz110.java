public class Quiz110 {
    //65 ~ 90까지의 난수와 97 ~ 122까지의 난수를 무작위로 출력

    static final int MINMAX = 90;
    static final int MINMIN = 65;
    static final int MAXMAX = 122;
    static final int MAXMIN = 97;

    static int range1, range2, rannum1, rannum2;

    public static void initQuiz110(){
        range1 = MINMAX - MINMIN +1;
        range2 = MAXMAX - MAXMIN +1;

        setQuiz110();
    }
    public static void setQuiz110(){
        rannum1 = (int)(Math.random() * range1 + MINMIN);
        rannum2 = (int)(Math.random() * range2 + MAXMIN);

        printQuiz110();
    }
    public static void printQuiz110(){
        System.out.println("65 ~ 90까지의 난수 = "+rannum1);
        System.out.println("97 ~ 122까지의 난수 = "+rannum2);
    }


}
