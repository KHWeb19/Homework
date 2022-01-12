public class ClassTest {
    public static void main(String[] args) {
        //외부에 있는 Person 클래스를 끌어와서 사용한다



        Person person = new Person();
        //new를 만들어주면 person이라는 객체를 생성함.
        //person 이란 객체는 외부 Person 클래스 안에 저런 정보들을 가지고 있음
        //객체내부에 접근 할때 . 을 입력
        person.setName("안녕하세요");
        person.setAge(41);


        System.out.printf("이름: %s, 나이: %d\n",
                person.getName(), person.getAge());
        //person.getName(),이 리턴한 정보로 치환이 됨


    }
}
