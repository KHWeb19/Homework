public class Cat {
    public static void main(String[] args) {

        // Q3. 고양이 클래스를 만들어보자

        // 클래스이름 객체참조변수이름 = new 클래스이름();

        // 클래스의 개요
        // 1. 새로운 자료형을 만들어내는 것
        // 2. 클래스의 구성
        //  1) 멤버변수 -> 공통적인 특성,특징저장
        //  2) 메서드 -> 공통적인 기능을 만듬
        // 3. 클래스의 내용
        // ex) 속성 - 변수 -> String name; // 이름
        //                int year; // 연식
        //               String Color; // 색상
        // void startEnginee(){} // 시동걸기
        // void speedUp(int speed){} // 속도증가
        // void speedDown(int speed){} // 속도감소

        Cat catclass = new Cat();

        catclass.grooming();
        catclass.eat();
        catclass.sleep();

    }

    private void sleep() {
        System.out.println("잠");
    }

    private void eat() {

        System.out.println("먹기");
    }

    private void grooming() {

        System.out.println("세수");
    }

}
