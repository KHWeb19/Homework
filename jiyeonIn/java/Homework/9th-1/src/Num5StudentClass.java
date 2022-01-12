public class Num5StudentClass {
    public static void main(String[] args) {
        /*5. 학생 클래스를 만들어봅시다.
          6. 학생 클래스에 수학, 영어, 국어 점수를 입력 받도록 개조합니다.
          7. 학생 클래스의 평균을 계산해봅시다.
          9. 7번 문제에서 분산을 구해봅시다.
          10. 7번 문제에서 표준 편차를 구해봅시다.*/

        Num5Student n5 = new Num5Student();

        System.out.print("수학 점수 입력");
        n5.math();
        System.out.print("영어 점수 입력");
        n5.english();
        System.out.print("국어 점수 입력");
        n5.korean();

        n5.avg();
        n5.dispersion();
    }
}
