public class StudentGrade {
    int average;
    public void initAverage() {
        average = Student.scoreSum/Student.SUBJECT_COUNT;
        System.out.println(average);
    }
    public void initDispersion() {
        Student.scoreSum = 0;
        for(int i=0; i<Student.SUBJECT_COUNT; i++) {
            Student.scoreSum += Math.pow(Student.score[i]-average, 2);
        }
        initAverage();
        System.out.println("표준편차: "+Math.sqrt(average));
    }
}
