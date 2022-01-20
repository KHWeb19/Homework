public class Home1 {
    public static void main(String[] args) {
        //65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        //여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자
        final int MIN = 65;
        final int MAX = 122;
        int range = MAX - MIN + 1;

        boolean isChar = true;
        while(isChar){
            int rand = (int)(Math.random()* range + MIN);

            boolean condition1 = rand >= 65 && rand<= 90;
            boolean condition2 = rand >= 97 && rand<= 122;

            if(condition1 || condition2){
                System.out.printf("rand는 영문자 대소문자중에 하나임 : %c(%d)\n", rand, rand);
                isChar = false;
                break;
            }
            System.out.printf("rand는 영문자 대소문자가 아님 : %c(%d)\n", rand, rand);

        }

    }
}
// 65이상 90이하 소문자, 97이상 122이하가 대문자
//Math.random()을 이용하여 65 ~ 122사이의 랜덤 숫자를 생성하게 한다.
//while문을 사용하여 랜덤문자를 다시 생성하도록 만든다.
//boolean을 이용하여 나온 랜덤수가 65이상 90이하를 넣을 수 있는 변수를 넣는다.
//booelan을 이용하여 나온 랜덤수가 97이상 122이하를 넣을 수 있는 변수를 넣는다.
//if 문을 사용하여 소문자나 대문자가