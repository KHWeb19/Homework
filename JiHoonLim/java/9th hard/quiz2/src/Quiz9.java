public class Quiz9 {
    final int START = 1;
    final int END = 100;

    final int REMAIN = 0;

    final int MAX = 10;
    final int MIN = 2;

    int i  , rand,range, sum;

    boolean isRandom;

    public void initQuiz(){
        sum = 0;
        rand = 0;
        range = MAX - MIN + 1;

        isRandom = false;
        putQuiz();
    }

    public void putQuiz(){
        for (i = START; i <= END; i++){
            while (!isRandom){
                rand = (int)(Math.random()*range+MIN);
                isRandom = true;
            }

            if (i % rand == REMAIN){
                System.out.println(rand+ " 의 배수 " +i);
                isRandom = false;

                sum += i;
            }
        }
        printQuiz();
    }

    public void printQuiz(){
        System.out.println("총합은 " +sum );
    }
}
