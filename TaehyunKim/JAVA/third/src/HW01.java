public class HW01 {
    public static void main(String[] args) {
        // 1. 65~122 사이의 랜덤 문자 생성
        // 소문자나 대문자가 아니면 다시 문자 생성

        // 65~90 는 대문자 , 97~122는 소문자

        int min = 65;
        int max = 122;

        boolean isLetter = false;

        while (!isLetter){
            int a = (int) (Math.random() * (max - min +1) + min);
            boolean test1 = ( a>= 65 && a <= 90);
            boolean test2 = ( a>= 97 && a <= 122);
            if ((a >=65 && a<= 90) || (a>=97 && a<= 122))
            {
                System.out.printf("생성된 문자: %c", a);
                isLetter = true;
            }
            else{
                System.out.printf("실패작: %c\n", a);
            }

        }

    }
}
