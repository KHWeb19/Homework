import javax.xml.crypto.Data;

public class MealEx {                    //메뉴자체를 여기 집어 넣어도 가능하지만 넣는 자체가 Meal이라는 엔티티를 오염시킴

    static final int MEAL_TIME_COUNT = 3; //식사시간 3번

   // private Data[] meal ; //시간 배열 ...조식 중식 석식

    static MenuEx menu;

    public void initMeal(){
        Data[] meal = new Data[MEAL_TIME_COUNT];
        menu = new MenuEx();
        menu.initMenu();

    }
    //public void randomMealAlloc(){



    }







