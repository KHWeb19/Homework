import java.util.Scanner;

public class Student {
    //문제 6. 학생 클래스에 수학, 영어, 국어 점수를 입력받도록 개조합니다.
    //문제 7. 학생(Student) 클래스의 평균을 계산해봅시다.
//7_1. 학생 30명(한 반)의 배열을 만든다. 요새는 한 반에 30명 안되겠지만 아무튼.
//7_2. 문자(수학, 영어, 국어)라고 입력하면 배열[0~29] = 점수 를 출력해주는 클래스로 만든다.
    static final int STU_MAX = 30;

    private String[] stuNum;
    private Scanner scan;
    private boolean initCheck; //방어루틴 설정용

    public void initStudent(){
        stuNum = new String[STU_MAX];
        scan = new Scanner(System.in);
        //키보드 입력 준비

        addSubject();
        printStuNum();

        initCheck = true;
    }

    //학생들의 배열을 출력할 수 있는 메서드를 만든다.
    public void printStuNum() {
        Score score = new Score(); //Score 데이터 타입의 객체를 생성
        score.initScore();

        int sum = 0;

        //addSubject 매서드(과목 이름 입력)를 입력한다.

        for (int i = 0; i < STU_MAX; i++) {
                System.out.printf("우리반 학생 [%d] = [%d]\n", i, score.printScore());
                //Score 객체 내부에 있는 printScore을 실행한다.

            int classScore = score.printScore();
            sum += classScore;
            }
        }

        public void addSubject(){
            System.out.println("우리반 과목별 평균, 분산, 표준편차 확인");
            System.out.println("과목 명을 입력해주세요.");

            String subName = scan.nextLine();
            printStuNum(); //객체 내부의 매서드를 호출함

        }
}
