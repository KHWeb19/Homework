import java.util.Date;

public class Meal {
    static final int MEAL_TIME_COUNT = 3;

    //메뉴를 어떤 것을 고를까 고민을 시작했음
    //여기서 메뉴를 넣게 되면 생각해야할 것이 향후 학교 급식을
    // 운영하는 업체가 학생들의 의견을 반영하여 새로운 음식을 추가하거나
    //혹은 별로 인기가 없는 음식들을 제외하고 새로운 음식을 추가하는 작업을 할때
    // Meal이라는 엔티티가 오염되는 상황이 발생함
       //1. 신규메뉴 추가
       //2. 기존메뉴 삭제
    //그러므로 새로운 클래스를 만들어서 이를 관리해주는 것이 좋다고 판정!

    //ex)다단계: 잘못 엮이면 못 빠져나옴(개발의 세계에서도 현실판으로 구현됨)
    //          실제로 과도하게 엮인 클래스간의 관계는 프로그램을 갈아엎지 않는 이상 해결하기 힘들다.
    //          그렇기 때문에 이런 코드가 난무하는 회사는 지옥같은 일상이 펼쳐지게 됨

    // 시간 배열
    private Date[] meal;
    // 문자열 배열(메뉴)
    //private String[][] menu;
    private Menu menu;

    public void initMeal () {
        //Data 타입의 배열을 3개(MEAL_TIME_COUNT) 생성(조식, 중식, 석식)
        //Date는 시간을 관리하기 위한 클래스임(아직 활용은 안하고 셋팅만 해놓음)
        meal = new Date[MEAL_TIME_COUNT];
        menu = new Menu();

        menu.initMenu();
    }

    public void randomMealAlloc () {

    }
}

//학교의 식사 일정
//1.조식, 중식, 석식
//2.식단표(요약) : 조식(7시 10분~9시), 중식(12시~13시), 석식(17시~18시)
//               메뉴(밥, 국, 반찬(2~4가지 정도))
