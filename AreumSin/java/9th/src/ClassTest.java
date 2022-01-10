public class ClassTest {
    public static void main(String[] args) {

        //Class를 어렵게 생각할 필요없음
        // 이 녀석은 사용자가 커스텀하는 데이터 타입

        // int, float, double, BigInteger

        Person person = new Person(); //데이터타입 변수이름 = new 클래스명();
                // 객체
                // 객체 정보는 Person클래스에 있음

        // 클래스를 객체화 시킬때는 반드시 new 클래스명()으로 객체화 한다.

        // 객체 내부에 접근할때 '.'을 사용한다.
        person.setName("김종인 좋아해");
        person.setAge(28);


        System.out.printf("이름: %s, 나이: %d",person.getName(), person.getAge());

    }
}
