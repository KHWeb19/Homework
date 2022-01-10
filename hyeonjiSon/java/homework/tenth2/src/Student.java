public class Student { //인스턴스(객체_
    String name; //인스턴스 필드
    int age; //인스턴스 필드

    Score score;

    public void initInfo(String name, int age) { //메소드
        this.name = name;
        this.age = age; //this.age 필드 / age 매개변수
        //this. 란?
        //필드와 메소드 매개변수 이름이 동일한 경우, 인스턴스 필드임을 명확히 하기 위해 사용

        //정보 안에 Score 인스턴스도 객체화 시킨다.
        Score score = new Score();
        score.initScore();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
