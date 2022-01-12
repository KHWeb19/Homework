public class CatInfo {
   // 2.고양이의 정보를 정리할 메서드를 만든다. (name - CatInfo
       //person을 참고하라고 하셨으니 이번에는 set, get함수를 사용해보자.
    //2_1. 고양이라는 객체가 가지는 정보 - 고양이 종류, 고양이 이름, 나이
    private String sort;
    private String name;
    private int age;

    //2_2. 메서드 만들기
    //  먼저 앞에 public을 붙인다.
    //  설정하는 함수(Setter)와 가져오는함수(Getter)를 정보마다 설정해준다.

    public void setSort(String sort){
        //this는 객체 자신을 의미
        this.sort = sort;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //  해당 기능이 어떤 결과를 반환하느냐에 따라 반환 결과에 대한 리턴 데이터 타입을 적는다.
    public String getSort(){
        return sort;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
