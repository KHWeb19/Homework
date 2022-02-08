public class Student {
    String name;
    int age;
    String major;

    Subject subject;
    Score score;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void addStudent(){
        subject = new Subject();
        subject.addSubject();

        score = new Score();
        score.calcScore();
    }

    @Override
    public String toString() {
        return "Student { " +
                "name = '" + name +
                ", age = " + age +
                ", major = '" + major + "'\n" +
                "" + score +
                '}';
    }
}



