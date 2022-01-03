public class Practice3 {
    public static void main(String[] args) {
        //문제3. 고양이 클래스를 만들어주세요.

        /*
        1.main class를 만들어준다.
*/
        //1. CatTest 클래스를 객체화시킨다. (new 클래스명() 사용)
        CatInfo catTest = new CatInfo();

        //'.'을 사용해서 객체 내부에 접근한다.
        catTest.setSort("코리아숏헤어");
        catTest.setName("콩밤");
        catTest.setAge(1);

        System.out.println("CatInfo 메서드를 활용해 고양이의 정보를 정리해보자.");
        System.out.printf("고양이 종: %s\n" +
                        "고양이 이름: 콩밤\n" +
                        "고양이 나이: 1\n"
                , catTest.getSort(), catTest.getName(), catTest.getAge());


//        2.고양이의 정보를 정리할 메서드를 만든다. (name - CatInfo)

    }


}
