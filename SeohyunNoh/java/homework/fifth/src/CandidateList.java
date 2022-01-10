import java.util.Scanner;

public class CandidateList {
    // 2by2 이중배열을 만들어 출력
    /* <취업지원프로그램 지원자 리스트 만들기>
    1. 성별(남,녀)과 재직상태(구직자,재직자)에 따른 2by2배열 만들기
    2. initList매서드
        1) initInfo 배열 생성
        2) 사용자가 정보를 입력할 수 있도록 scan
        3) enterInfo매서드를 호출하여 info입력하도록
    3. enterInfo
        1) 성별과 재직상태 입력
     */

    final int MALE_OR_FEMALE = 2;
    final int SEEKER_OR_INCUMBENT = 2;

    private String[][] initInfo;

    private Scanner scan;

    public void initList(){
        initInfo = new String[MALE_OR_FEMALE][SEEKER_OR_INCUMBENT];

        scan = new Scanner(System.in);

        enterInfo();

    }
    public void enterInfo() {

        System.out.print("성별을 입력하세요. (남/여)");
        String maleOrFemale = scan.nextLine();

        System.out.println("성별 : " + maleOrFemale);

        System.out.print("재직상태를 입력하세요. (구직자/재직자)");
        String seekerOrIncumbent = scan.nextLine();

        System.out.println("재직상태 : " + seekerOrIncumbent);
    }

}
