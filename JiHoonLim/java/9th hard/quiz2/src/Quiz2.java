public class Quiz2 {
    final int START = 2;
    final int LAST = 20;
    int first, second, i ;
    int sum;

        public void initQuiz(){
            first = 0;
            second = 1;
            sum = 0;
            System.out.println("1항은 " +second);
            putQuiz();
        }

        public void putQuiz(){
            for (i=START; i<=LAST; i++) {
                sum = first + second;
                first = second;
                second = sum;
                printQuiz();
            }
        }
        public void printQuiz(){
            System.out.println(i+ "항은 " + sum);
        }

}
