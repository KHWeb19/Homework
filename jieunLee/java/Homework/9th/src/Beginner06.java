public class Beginner06 {
    public static void main(String[] args) {
        Student student = new Student();
        StudentGrade studentGrade = new StudentGrade();

        student.setName("이지은");

        System.out.println(student.getName()+" 성적");
        student.initScore();
        System.out.printf("평균: ");
        studentGrade.initAverage();
        System.out.printf("분산: ");
        studentGrade.initDispersion();
    }
}
