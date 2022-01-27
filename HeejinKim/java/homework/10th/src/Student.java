public class Student {

    String name;
    int age;
    String major;
    StudentScore score;

    //초기화 먼저
    public void initStudent(String name,int age,String major){

        this.name = name;
        this.age = age;
        this.major=major;

        score = new StudentScore();
       score.initScore();

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", score='" + score +
                '}';
    }
}
