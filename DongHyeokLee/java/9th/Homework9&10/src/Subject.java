import java.util.Scanner;

public class Subject {
    //수강할 과목 배열화
    // 과목 갯수/ 과목을 추가할것인지

    private Scanner scan;

    boolean checkSubject = true;
    final int SELECT_MAX = 10;
    int cnt = 0;
    String[] subject = new String[SELECT_MAX];

    public void selectSubject() {


        while (checkSubject) {
            scan = new Scanner(System.in);


            System.out.print("성적 확인 할 과목을 입력하시오 : ");
            String select = scan.nextLine();

            subject[cnt] = select;

            addSubject();
        }
        System.out.println("=======수강 신청 과목========");
        cnt++;
        for(int i = 0; i < cnt; i++){
            System.out.print(subject[i] + " ");
        }

    }


    public void addSubject(){

        System.out.print("강의를 추가 하시겠습니까? (Y/N)");
        String yOrN = scan.nextLine();

        if(cnt >= 9) {
            System.out.println("최대 과목수 입니다.");
            checkSubject = false;
        }else if(yOrN.equals("Y")){
            cnt++;
            checkSubject = true;
        }else{
            checkSubject = false;
        }

    }
}
