public class Quiz19 {
    //4 ~ 97까지의 랜덤 숫자를 출력

    static final int MAX = 97;
    static final int MIN =4;

    static int range, rannum;

    public static void initQuiz19(){
        range = MAX - MIN +1;

        setQuiz19();
    }
    public static void setQuiz19(){
        rannum = (int)(Math.random() * range + MIN);

        printQuiz19();
    }
    public static void printQuiz19(){
        System.out.println("4 ~ 97까지의 랜덤 숫자 =  "+rannum);
    }

}
