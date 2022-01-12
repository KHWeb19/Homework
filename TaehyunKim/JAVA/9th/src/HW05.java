public class HW05 {
    // 5. 학생 클래스를 만들어봅시다.
    //
    //
    //6. 학생 클래스에 수학, 영어, 국어 점수를 입력 받도록 개조합니다.
    //
    //
    //7. 학생 클래스의 평균을 계산해봅시다.
    //[출처] 문제 은행 [ 4 ] (에디로봇아카데미) | 작성자 링크쌤

    public static void main(String[] args) {
        Student myStudent = new Student();

        System.out.printf("학생의 평균점수: %.2f\n", myStudent.getAverage());
        System.out.printf("분산값: %.2f\n", myStudent.getVariance());
        System.out.printf("표준편차값: %.2f\n", myStudent.getStdDeviation());
    }
}
