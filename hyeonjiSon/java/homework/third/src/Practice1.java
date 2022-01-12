public class Practice1 {
    public static void main(String[] args) {
        //문제1. 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        //      여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자.

        final int min = 65; //출력되는 가장 작은 숫자
                            //또한 65는 대문자 A의 10진수 아스키 코드 번호! 대문자 Z는 90
        final int max = 122; //출력되는 가장 큰 숫자
                             //97~122는 소문자 a~z 의 아스키 코드 번호!

        //아스키코드표 91~96사이의 문자들이 출력되지 않도록처리해야 함.

       int range = max - min +1; // range = 122-65 = 57(min과 max 두 숫자 사이의 범위)
                                                    // 하지만 그냥 57은 0~56으로 출력되니까 +1을 더한다!

        int random = (int)(Math.random() * range + min); // range(1~57의 숫자)에 모두 +65가 더해져
                                                         // 122까지의 숫자가 출력될 수 있음.

        //대문자 출력을 위한 식
        boolean condition1 = random >= 65 && random <= 90;
        //풀이: int random이 65보다 크거나 같고 또한 int random이 90보다 작거나 같으면 참이다.

        //소문자 출력을 위한 식
        boolean condition2 = random >= 97 && random <=122;
        //풀이: int random이 97보다 크거나 같고 또한 int random이 122보다 작거나 같으면 참이다.

        if(condition1){ //만약, condition1의 조건을 만족하는 경우 아래의 내용을 출력한다.
            System.out.printf("65~90사이의 랜덤한 문자 생성(대문자) : %c\n", random);
        }

        if(condition2){ //만약, condition2의 조건을 만족하는 경우 아래의 내용을 출력한다.
            System.out.printf("97~122사이의 랜덤한 문자 생성(소문자) : %c\n", random);
        }
    }
}

//random 의 숫자가 %c(문자를 출력하는 출력문)에 대입되어서 해당 숫자에 맞는 아스키 코드표 상의 알파벳이 출력됨!