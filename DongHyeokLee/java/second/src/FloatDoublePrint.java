public class FloatDoublePrint {
    public static void main(String[] args) {
        float fnum1 = 3.3f;
        double fnum2 = 7.7;
        // float은 숫자에 f를 붙여서 float 타입임을 명시함

        System.out.println("요런게 편해요 - fnum1: " + fnum1);
        System.out.println("요런게 편해요 - fnum2: " + fnum2);

        System.out.printf("앤 타입을 알아야함 - fnum1: %f\n", fnum1);
        System.out.printf("앤 타입을 알아야함 - fnum2: %f\n", fnum2);

        System.out.println("하지만 요런식으로 정밀 제어가 가능함");
        System.out.printf("앤 타입을 알아야함 - fnum1: %.2f\n", fnum1);

    }
}


// Q. 앞에 float 이 붙었는데 뒤에 f가 필요한 이유는 뭘까요?

//변수란?? 특정한 데이터타입의 정보를 저장할 수 있는 메모리공간 - c
// 특정 데이터타입의 정보를 저장할 수 있는 공간 - JAVA