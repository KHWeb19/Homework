public class Student {
    String name;
    int grade;
    String major;

    Score score;


    public void initStudent(String name, int grade , String major){
        this.name = name;
        this.grade = grade;
        this.major = major;

        System.out.println("이름: " + name + " 학년: " + grade + " 전공: " + major);

        score = new Score();
        score.outputScore();



    }
}


