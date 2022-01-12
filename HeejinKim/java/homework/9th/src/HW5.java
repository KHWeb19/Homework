public class HW5 {
    // 학생 클래스 만들기
    public static void main(String[] args) {

        Student student = new Student();

        student.setScore();
        System.out.printf("평균=%.2f\n",student.average());
        System.out.printf("분산=%.2f\n",student.disperse());
        System.out.printf("표준편차=%.2f",student.stand());


    }
}
