public class HomeworkA {
    public static void main(String[] args) {
        //1. 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        //   여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자.
        // 아스키 코드에서 대문자: 65~90 소문자: 97~122
        final int MAX = 122;
        final int MIN = 65;

        // 91~96까지는 나오면 안됨
        int range = MAX - MIN +1;

        int num = (int)(Math.random()* range + MIN);

        //System.out.println("num : "+num);

            if(!(91<=num && num>=96)){
                System.out.printf("num : %c (%d)\n",num, num);
            }


    }
}
