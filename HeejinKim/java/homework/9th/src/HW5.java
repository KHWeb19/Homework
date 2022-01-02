public class HW5 {
    // 학생 클래스 만들기
    public static void main(String[] args) {

        Student student = new Student();

        student.setScore();
        System.out.printf("평균=%d",student.average());

    }
}
