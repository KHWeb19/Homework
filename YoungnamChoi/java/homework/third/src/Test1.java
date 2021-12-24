public class Test1 {
    public static void main(String[] args) {

        //65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        //
        //   여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

        int rand1 = (int) (Math.random() * 58 + 65);

        if (rand1 >= 65 && rand1 <= 90) {
            System.out.printf("%c\n", rand1);
        } else if (rand1 >= 97 && rand1 <= 122) {
            System.out.printf("%c\n", rand1);
        } else {
            System.out.println("");

        }

    }
}

//Q 서로 조건이 맞이 않을 경우 프로그램을 재성성 하는 것을 어떤식으로 표현해야 하는지 모르겠습니다.
