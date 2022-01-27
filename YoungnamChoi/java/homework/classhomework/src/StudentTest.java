public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Dave");
        student.setDept("경영학과");

        System.out.printf("학생의 이름: %s 학과: %s\n" ,student.getName(),student.getDept());

        Grade grade = new Grade();
        grade.initScore();

        StudentScore studentScore = new StudentScore();
        studentScore.initGrade();
    }

}
