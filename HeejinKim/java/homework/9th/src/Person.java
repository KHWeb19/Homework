public class Person {
    private String name;  //2.여기서 발생 ! Person 안에 있는 name이 있고 메서드 안의 name이 있는데 다른  name임
    private int age;




    /* 메모리 상에 표기된 person 객체 (Person 아님)

|------------------|
| String name      |      3.객체안에 있는 name은 이거 //저 위에꺼
| int age         |
|------------------|
| setName          |
| setAge           |
| getName          |
| getAge           |
|------------------|
       person
*/

    public void setName (String name) { //1.안녕하세요란 정보가 String name이란 변수로 들어간다는 뜻
        // setName란 메서드는 이름설정 이란 의미
        // this는 객체 자신을 나타냄
        // 결국 this.name은 현재 객체에 있는 name을 의미하고
        // 그냥 name은 입력으로 들어온 name을 의미함
        // 최종적으로 객체에 있는 name이 입력으로 들어온 name의 값을 가지게 됨
        this.name = name;
    }       //4.요 name이 같기 때문에 구분할 필요가 있음
            //즉 객체의 name과 입력한 name 을 구분하려고
            //5.string name이 안녕하세요니까 this.name = name; 이렇게 대입을 하면서 저 위의 객체의 name이 안녕하세요가 된당
    public void setAge (int age) { //return이 없으니까 void
          //나이를 설정한다고 setAge라고 메서드를 명명해줌 //외부에서 들어온 41dl int age로 들어오고
        this.age = age;
        // this.age는 person 객체의 age인데 들어온 41을 대입하니까  person 객체의 age가 41이 된것임.


    }

    public String getName () {

        return name; //void가 아니라 String임 return이 존재
        //getName이 호출이 되면 name의 결과를 반환해준다
        //여긴 입력이 없으니까 name이 자기 자신밖에 없으니까 그래서 그냥 name임 (this name을 안씀)
    }
    public int getAge () {

        return age;
    }
}

