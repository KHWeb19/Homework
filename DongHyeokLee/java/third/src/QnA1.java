public class QnA1 {
    public static void main(String[] args) {
        //65 ~ 90 , 97~122 무작위 난수
        //final은 상수값을 지정
        //상수값을 지정할때는 변수명은 전부 대문자로 만든다.
        //(부가적인 관습) - 지키는게좋음
        // class 이름은 시작이 무조건 대문자
        // 만약 다중 단어로 구성된다면 단어 이니셜마다 대문자로 구성한다.
        // 변수나 매서드(함수)의 경우엔 시작은 소문자 이후 class와 마찬가지로
        // 다중 단어로 구성된 경우 시작 소문자 이후 나머지는 이니셜마다 대문자로 구성

        final int MAX1 = 90;
        final int MIN1 = 65;

        final int MAX2 = 97;
        final int MIN2 = 122;

        int range = MAX1 - MIN1 + 1;
        int rand = (int)(Math.random()* range + MIN1);
        System.out.println("65 ~ 90 사이의 무작위 난수 : " + rand);

        range = MAX2 - MAX2 +1;
        rand = (int)(Math.random()* range + MIN2);
        System.out.println("97 ~ 122 사이의 무작위 난수 : " + rand);

        //Q. final을 사용하는 이유 - 유지보수 용이



        // final로 변수를 지정하면 밑에 값을 변경하더라도 컴파일이 안됌




    }
}
