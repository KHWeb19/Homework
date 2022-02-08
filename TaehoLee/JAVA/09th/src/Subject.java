import java.util.Scanner;

public class Subject {

    Scanner scan;

    final int MAX_CLASS = 100;
    private static String[] subjectName;
    private static int subjectCount;

    public boolean isClassFinished(){
        System.out.println("과목을 계속 입력하시겠습니까? (y/n) : ");

        while (true) {
            String yOrN = scan.nextLine();

            if (yOrN.equals("n")) {
                return false;
            } else if (yOrN.equals("y")) {
                System.out.print("다음 과목을 입력하세요: ");
                return true;
            } else {
                System.out.print("y 또는 n을 입력하세요 (y/n): ");
            }
        }
    }

    public void addSubject(){
        scan = new Scanner(System.in);

        String[] tempSubjectName;
        tempSubjectName = new String[MAX_CLASS];
        subjectCount = 0;

        System.out.print("과목명을 입력하세요 : ");
        do{
            tempSubjectName[subjectCount++] = scan.nextLine();
        }
        while (isClassFinished());

        subjectName = new String[subjectCount];

        for(int i = 0; i < subjectCount; i++) {
            subjectName[i] = tempSubjectName[i];
        }
    }

    public static int getSubjectCount() {
        return subjectCount;
    }

    public static String[] getSubjectName() {
        return subjectName;
    }
}
