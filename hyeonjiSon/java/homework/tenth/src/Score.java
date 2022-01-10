public class Score {
    //문제 6. 학생 클래스에 수학, 영어, 국어 점수를 입력받도록 개조합니다.
    //6_1. 점수를 출력할 수 있는 메서드를 만들어준다.
    //6_2. 이때 점수의 범위는 60~100 사이가 나올 수 있도록 한다.

    final int MAX = 100;
    final int MIN = 60;
    int range;

    public void initScore() {
        printScore();
    }

    public int printScore() {
        range = MAX - MIN + 1;
        return (int) (Math.random() * range + MIN);
    }
}
