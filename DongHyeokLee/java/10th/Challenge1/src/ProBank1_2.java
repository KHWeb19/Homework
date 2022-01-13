public class ProBank1_2 {
    public static void main(String[] args) {
       // 정수형 변수 1개, float 변수 2개, double 변수 3개에 아무 값이나 할당하고 출력합니다.

        // 크게 생각 하랬음
        // 지금은 변수 1개 2개 3개 정해져있지만 달라 질 수 있음
        //랜덤 값

        MyCustomDataType my = new MyCustomDataType(1,2,3);

        //이 부분 불러 오지 않으면 출력이 안되는 거였음!
        my.allAlloc();
        System.out.println(my);



    }
}
