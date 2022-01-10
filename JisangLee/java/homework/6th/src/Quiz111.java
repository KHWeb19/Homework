public class Quiz111 {
    //65 ~ 122까지의 난수를 무작위로 생성하고
    //65 ~ 90 혹은 97 ~ 122에 해당하는 숫자만 출력

    static final int MAX = 122;
    static final int MIN = 65;
    static int range, rannum;

    public static void initQuiz111() {
        range = MAX - MIN + 1;

        setQuiz111();
    }

    public static void setQuiz111() {
        rannum = (int) (Math.random() * range + MIN);

        printQuiz111();
    }

    public static void printQuiz111() {
        if (rannum >= 65 && rannum <= 90) {
            System.out.println("65 ~ 90까지의 난수 = " + rannum);
        } else if (rannum >= 97 && rannum <= 122) {
            System.out.println("97 ~ 122까지의난수 = " + rannum);
        } else {
            System.out.println(" ");
        }
    }
}


