public class studentTest {
    public static void main(String[] args) {

        student student = new student();

        student.name = "Jenny";
        student.grade = 4;
        System.out.println("학생의 이름 : "+student.name);
        System.out.println("학생의 학년 : "+student.grade);
        student.InputScore();
        studentScoreCal.avgCal();
        studentScoreCal.varCal();


    }
}
