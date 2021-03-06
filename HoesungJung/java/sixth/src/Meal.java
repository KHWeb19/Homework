import java.util.Date;

public class Meal {
    static final int MEAL_TIME_COUNT = 3;

    // 지금 메뉴를 어떤 것을 고를까 하면서 고민을 시작했음
    // 여기서 메뉴를 넣게 되면 생각해야할 것이
    // 향후 학교 급식을 운영하는 업체가 학생들의 의견을 반영하여 새로운 음식을 추가하거나
    // 혹은 별로 인기가 없는 음식들을 제외하고 새로운 음식을 추가하는 작업을 할 때
    // Meal이라는 엔티티가 오염되는 상황이 발생함
    // 1. 신규 메뉴 추가
    // 2. 기존 메뉴 삭제
    // 그러므로 새로운 클래스를 만들어서 이를 관리해주는 것이 좋다고 판정!

    // * 다단계: 잘못 엮이면 못 빠져나옴(이게 개발의 세계에서도 현실판으로 구현됨)
    //          실제로 과도하게 엮인 클래스간의 관계는 프로그램을 갈아엎지 않는 이상 해결하기 힘듬
    //          그렇기 때문에 이런 코드가 난무하는 회사에서는 지옥같은 일상이 펼쳐지게됨

    // 시간 배열
    private Date[] meal;
    // 문자열 배열(메뉴)
    //private String[][] menu;
    private Menu menu;

    public void initMeal () {
        meal = new Date[MEAL_TIME_COUNT];
        menu = new Menu();

        menu.initMenu();
    }

    public void randomMealAlloc () {

    }
}
