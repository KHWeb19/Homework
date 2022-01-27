public class Student {
    //문제 6. 학생 클래스에 수학, 영어, 국어 점수를 입력받도록 개조합니다.
    //문제 7. 학생(Student) 클래스의 평균을 계산해봅시다.
//7_1. 학생 30명(한 반)의 배열을 만든다. 요새는 한 반에 30명 안되겠지만 아무튼.

    final int S_NUM = 30;
    private int[] s_arr;
    int sum;
    int average;
    float variance;
    float deviation;

    public void initStudent() {
        s_arr = new int[S_NUM];

        //출력할 것 : 배열, 평균, 분산, 표준편차
        printS_Arr();
        printAverage();
        printVar();
        printDev();
    }

    public void printS_Arr() {
        Score score = new Score();

        for (int i = 0; i < S_NUM; i++) {
            s_arr[i] = score.printScore();
            System.out.printf("학생[%d] 번 점수 : %d\n", i, s_arr[i]);
        }
    }

    public void printAverage(){
        Score score = new Score();

        sum = 0;
        for (int i = 0; i < S_NUM; i++) {
           sum +=s_arr[i];
        }
        average = (int)((float)sum/S_NUM);
        System.out.println("반 평균: " + average);
    }

    public void printVar(){
        variance = (float)(sum) / (S_NUM - 1);
        System.out.println("분산: " + variance);
    }

    public void printDev(){
        deviation = (float)Math.sqrt(variance);
        System.out.println("표준편차: " + deviation);
    }

}

    //7_2. 문자(수학, 영어, 국어)라고 입력하는 스캐너를 만든다.
   // 스캐너 값을 받은 후 배열[0~29] = 점수(score)을 출력해주는 메소드를 만든다.
// → 이것보다 기능이 더 많으면 좋지 않을 것 같으니까 스캐너를 Grade에 만들고 Grade를 main이랑 연결하자

