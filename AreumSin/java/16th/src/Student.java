//extends 가 상속 받는 키워드
public class Student extends Person{
    private String major;

    public Student (String name, int age, String major) {
        // super()는 자신의 상위 부모를 의미함.
        // 상위쪽으로 보낸거.
        // 상위 내용을 호출.
        super(name, age);

        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                super.toString() + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    // 상속을 사용하는 이유는
    // 코드를 재 사용하기 위해서

}
