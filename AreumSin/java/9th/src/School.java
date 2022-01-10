public class School {
    Meal meal;
    //Lecture lecture;
    //Exam exam;

    //메소드를 작성하는 방법.
    // 1. 일단 무조건 public을 작성
    // 2. 리턴 타입을 적는다.
    // 3. 메서드(기능)의 이름을 적는다.
    // 4. 소괄호 내부에 입력 값
    public void initSchool(){
        meal = new Meal();
        meal.initMeal();
    }
}

// 학교에서 하는 일과
// 1. 식사 - Meal
// 2. 수업 - Lecture
// 3. 시험 - Exam