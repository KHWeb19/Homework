public class School {
    Meal meal;
    //Lecture lecture;
    //Exam exam;

    //매서드를 작성하는방법
    //1. 일단 무조건 public을 박으세요!
    //2. 리턴 타입을 접습니다.
    //3. 매서드(기능)의 이름을 적습니다.
    //4. 소괄호 내부에 입력으로 들어올 사항이 있다면 적습니다.
    //   (업으면 비웁니다.)
    //5. 중괄호 내부에 해당 매서드가 처리할 기능을 작성합니다.
    public void initSchool () {
        //Meal이라는 커스텀 데이터 타입(클래스)의 객체를 생성
        meal = new Meal();
        // meal 객체 내부에 있는 initMeal을 실행하라.
        meal.initMeal();
    }
}

//학교에서 하는 일과
//1. 식사 - Meal
//2. 수업 - Lecture
//3. 시험 - Exam
