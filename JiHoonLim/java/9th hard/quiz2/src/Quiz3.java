public class Quiz3 {
    final int START = 4;
    final int END = 25;
    int first, second, third,i, sum;

    public void initQuiz(){
        first = 1;
        second = 1;
        third = 1;
        sum = 0;

        System.out.println("1항은 " +first);
        System.out.println("2항은 " +second);
        System.out.println("3항은 " +third);

        putQuiz();
    }
    public void putQuiz(){
        for (i=START; i<=END; i++) {
            sum = first + third;
            first = second;
            second = third;
            third = sum;
            printQuiz();
        }
    }
    public void printQuiz(){
        System.out.println(i+ "항은 " + sum);
    }
}
