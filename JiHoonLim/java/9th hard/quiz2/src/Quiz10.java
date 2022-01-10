public class Quiz10 {
    final int START = 1 ;
    final int END = 100 ;

    final int MAX = 10;
    final int MIN = 2;

    int range ;
    int sum ;
    int rand;
    int i;

    public void initQuiz(){
        range = MAX - MIN +1 ;
        sum = 0;

        putQuiz();
    }

    public void putQuiz(){
        for (i = START; i <= END; i+=rand){
            rand = (int)(Math.random()*range+MIN);

            System.out.println("나온 수는 " +rand+ "\n" + "현재 이동한 위치는 " +i);

            sum += i;
        }
        printQuiz();
    }

    public void printQuiz(){
        System.out.println("총합은 " +sum);
    }

}
