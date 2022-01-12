public class Person {
    // 사람이라는 객체가 가지는 정보
    private String name;
    private int age;

    // 사람이라는 객체가 가지는 정보를 제어하기 위한 기능들
    //매서드를 만드는 방법
    //1. 먼저 앞에 public이나 private을 붙인다. (우선 지금은 그냥 public을 붙이도록 한다 - 향후 설명)
    //2. 해당 기능(매서드)이 어떤 결과를 반환하냐에 따라 반환 결과에 대한 리턴 데이터 타입을 적는다.
        // - 리턴(반환)하는 내용이 없다면 void를 적는다.
    //3. 변수의 이름을 만들듯이 매서드 이름을 적는다.
       // 매서드 이름에는 이 기능이 무엇을 하는지 명확히 명시하는 것을 권장한다.
    //4. 이름 뒤에는 소괄호가 오는데 소괄호 에는
       // 입력으로 들어오는 정보의 데이터 타입과 입력으로 ㄷ르어온 정보가 무엇인지 나타낼 수 있는 이름을 적는다
       //(변수 선언이랑 동일함 - 다만 입력된 정보에 대한 내용을 다루는 것임)
    public void setName(String name){ //set: 설정하다
        //this는 객체 자신을 나타냄
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getName (){ //get: 가져오다
        return name; // return: 반환하다
    }
    public int getAge(){
        return age;
    }

}

/* 메모리 상에 표기된 person 객체(Person 아님)
|----------------|
| String name    |
| int age        |
|----------------|
| setName        |
| setAame        |
| getName        |
| getAame        |
|----------------|
      person





 */
