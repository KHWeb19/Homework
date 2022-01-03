public class Homework1 {
    public static void main(String[] args) {
        //1. 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        //
        //   여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자.

        // 소문자나 대문자가 아니라면 다시 생성하도록
        // 소문자나 대문자가 아닐경우는 다시 생성해야하니 반복문이 필요.
        // 소문자와 대문자가 아닐경우와 소문자와 대문자일 경우 두개로 나누니 boolean을 이용.

        // 소문자나 대문자가

        final int MAX = 122;
        final int MIN = 65;

        final int range = MAX - MIN +1;
        int num1;

        boolean isChar = true;

        while (isChar){
            num1 = (int)(Math.random()* range + MIN);
            //65 ~ 90
            //97 ~ 122

            // 항상 문자가 아니도록 만들어보기
            //num1 = (int)(Math.random()* 10 + 1);

            boolean M1 = 64 < num1 && 90 > num1;
            boolean M2 = 96 < num1 && 122 > num1;

            if(M1 || M2){
                System.out.printf("이건 문자입니다 %c (%d)", num1, num1); // 문자일 경우에는 출력후 끝남.
                //isChar = false; // 이거 필요한가요? 밑에 break를 통해서 while문에 빠져나가는거 아닌가요..?
                break; // while 문에 빠짐.
                // 여기서는 break와 isChar이 같은 역활을 하는게 아닌가요?
                // isChar이 false면 반복문의 조건이 맞지않아서 실행 불가능
                // break; 는 while문을 빠져나가는거니깐
            }

            System.out.printf("이건 문자가 아닙니다. %c (%d)", num1, num1);
        }
        System.out.println("신아름");
    }
}
