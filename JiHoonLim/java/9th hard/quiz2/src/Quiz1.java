public class Quiz1 {
    boolean isRight;
    int rand;
    boolean condition1;

    public void initQuiz() {
        isRight = false;

        putQuiz();
    }

    public void putQuiz() {
        while (!isRight) {
            rand = (int) (Math.random() * 58 + 65);
            condition1 = rand <= 90 || rand >= 97;
            printQuiz();
        }
    }

    public void printQuiz() {
        if (condition1) {
            System.out.printf("생성한 문자는 %c\n", rand);
            isRight = true;

        } else {
            System.out.printf("생성한 문자는 %c\n", rand);
            System.out.println("재생성합니다.");
        }
    }
}