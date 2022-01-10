import java.util.Arrays;
import java.util.Scanner;

public class Score {
    //6. 학생 클래스에 수학, 영어, 국어 점수를 입력 받도록 개조합니다.
    //6_1. 랜덤 점수 60~100 출력할 수 있는 메소드를 하나 만든다.
    final int ARR_MAX = 10;
    final int SCORE_MAX = 100;
    final int SCORE_MIN = 60;
    int range;

    int[] score;
    String[] scoreName;
    Scanner scan;

    int cnt;

    float average;
    float variance;
    float stDev;

    public void initScore(){
        Scanner scan = new Scanner(System.in);
        cnt = 0;
        //국영수 성적
        addSubject();

        //평균
        printAverage();

        //분산
        printVariance();

        //표준편차
        printStdDev();
    }

    public void setRange(){ //점수 범위를 메서드로 만든다
        range = SCORE_MAX - SCORE_MIN + 1;
    }

    //랜덤으로 점수를 뽑아주는 메서드
    public void inputScore(){
        score = new int[cnt]; //몇 과목이냐에 따라서 배열 갯수가 달라질 수 있도록
        setRange(); //이 메서드에서도 사용할 수 있도록 메서드 호출

        for(int i = 0; i < cnt; i++){
            score[i] = (int)(Math.random()* range + SCORE_MIN);
        }
    }

    public boolean checkInput(){ // 이 메소드는 아래에서 boolean변수같은 역할을 함
        System.out.print("계속 입력하시겠습니까?(y/n)");

        while(true){
            String yOrN = scan.nextLine();

            if(yOrN.equals("n")){
                return false;
            } else if(yOrN.equals("y")) {
                System.out.print("다음 과목을 입력하세요: ");
                return true;
            } else {
                System.out.print("다시 입력하세요! (y/n): ");
            }
        }
    }

    public void addSubject() {
        //collection객체란? 여러 데이터의 집합과 그룹을 다룰 수있는 자료구조다.
        //collection의 가장 기본 자료구조는 배열이다.
        //배열과의 차이점은 정적 메모리 할당이 아닌 동적 메모리 할당을 하게 되는 것이다.
        //배열은 미리 선언을 통해 해당 갯수 만큼의 공간을 만들어야하지만(예: new int[4])
        //collection은 공간이 필요한 만큼 계속 추가될 수 있다는 차이가 있는 것이다.

        //이것을 다루는 방법을 배우지 않았으므로 우선 백업 배열을 만들어 이런 역할을 하도록 해보자.

        String[] backup = new String[ARR_MAX];
        System.out.print("다루고 싶은 과목을 입력하세요: ");

        do {
            backup[cnt++] = scan.nextLine();
        } while (checkInput());

        scoreName = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            scoreName[i] += score[i];
        }
    }

    public void printAverage(){
        average = 0;

        for(int i = 0; i < cnt; i++){
            average +=score[i];
        }
        average /= cnt;
        System.out.println("평균점수: " + average);
    }

    public void printVariance(){
        variance = 0;

        for(int i = 0; i < cnt; i++){
            variance += Math.pow(score[i] - average, 2);
        }

        variance /= cnt;
        System.out.println("분산: " + variance);
    }

    public void printStdDev(){
        stDev = (float)Math.sqrt(variance);
        System.out.println("표준편차: " + stDev);
    }

    @Override
    public String toString() {
        return "Score{" +
                "ARR_MAX=" + ARR_MAX +
                ", SCORE_MAX=" + SCORE_MAX +
                ", SCORE_MIN=" + SCORE_MIN +
                ", range=" + range +
                ", scan=" + scan +
                ", score=" + Arrays.toString(score) +
                ", scoreName=" + Arrays.toString(scoreName) +
                ", cnt=" + cnt +
                ", average=" + average +
                ", variance=" + variance +
                ", stDev=" + stDev +
                '}';
    }
}
