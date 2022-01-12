import java.util.Scanner;
public class MenuEx {//메뉴를 추가하는 기능 넣음

    static final int SIDE_DISH_MAX = 4;
    //static final int SIDE_DISH_MIN = 2;
    static final int MAIN_DISH = 2;

    //private String[][] menu; //warning이 뜨고 안되서 바로 집어넣음
    private Scanner scan;
    private boolean initNotFinish;

    public void initMenu() {
        String[][] menu = new String[MealEx.MEAL_TIME_COUNT][SIDE_DISH_MAX + MAIN_DISH];
        scan = new Scanner(System.in);

        initNotFinish = true;
        systemInit(); //객체내에서 매서드 호출 가능
    }
    private void systemInit() {
        while (initNotFinish) {
            addMenu();                           // addMenu 매서드를 호출함

            System.out.print("계속 추가하시겠습니까 ? (y / n): ");
            String yOrN = scan.nextLine();       // nextLine()을 통해서 문자열을 입력 받음
            System.out.println("yOrN = " + yOrN);

            if (yOrN.equals("n")) {
                initNotFinish = false;
            }
        }
    }
    public void addMenu(){
        System.out.println("원하는 메뉴를 넣어주세요");
        String menuName = scan.nextLine();
        System.out.println("입력된 메뉴 = " + menuName);
    }

    }

