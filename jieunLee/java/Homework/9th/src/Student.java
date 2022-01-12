import java.util.Scanner;

public class Student {
    public static String name;
    public static int scoreSum;

    public static final int SUBJECT_COUNT = 3;
    public static int[] score = new int[SUBJECT_COUNT];

    public void setName(String name) {
        Student.name = name;
    }
    public String getName() {
        return name;
    }

    public void initScore() {
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<SUBJECT_COUNT; i++) {
            System.out.printf("%d성적을 입력하시오.", i+1);
            score[i] = scan.nextInt();
            scoreSum += score[i];
        }
    }
}
