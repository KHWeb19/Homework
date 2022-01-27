public class BeginnerQ5to10 {
    public static void main(String[] args) {

        // 학생 클래스를 만들어봅시다.

        Student student = new Student();
        // Student라는 타입으로 메모리 요청.
        // 이 구문이 실행시 Student 클래스의 생성자가 실행됨.
        student.initStudents("소덕준", 24, "실음");
        // Student 클래스의 initStudent() 메소드가 실행됨.

        System.out.println(student);

    }
}
