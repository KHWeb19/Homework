public class Q5 {
    public static void main(String[] args) {


    // 5. 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.

    // 루트를 구하는 코드: Math.sqrt()

    // Q질문 . 처음에는 4번문제 평균값도 못구했으나 이후 평균값을 구하는 코드를 작성했고
        // 해설강의 참고하면서 분산이랑 표준편차 구했습니다.

        final int STUDENT = 30; // 반 학생의 수 30명
        final int MAX = 100; // 100점 만점
        final int MIN = 60; // 최하점이 60점 이하

        int range = MAX - MIN + 1; // 범위값 지정

        int[] arr = new int[STUDENT]; // 배열 작성

        double sum = 0;
        double average;

        // 학생들의 점수를 임의로 배치
        for (int=0; i <= STUDENT; i++){
            arr[i] = (int) (Math.random() * range + MIN);

            sum + = arr[i];

            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        // 학생들의 평균값을 구해라
        // 학습의 평균값 = 학생들의 총점 / 반 학생 수
        average = sum / STUDENT;
        System.out.println("평균값= " + average);

        sum = 0;

        // 이후 해설강의 참고해서 진행
        for(int i=0; i<STUDENT; i++){
            sum + = Math.pow(arr[i] - average , 2);
        }

        System.out.println("분산= " +(sum / STUDENT));
        System.out.println("표준편차= " + Math.sqrt(sum / STUDENT));
    }
}



