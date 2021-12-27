public class Homework1 {
    public static void main(String[] args) {
        //65~122사이의 랜덤문자 생성
        //소문자 대문자 아닐시 다시 생성
        //boolean 사용

        final int MAX = 122 , MIN = 65;
        int range = MAX - MIN + 1;

       //boolean bl = true;
        boolean isChar = true;

        while(isChar){
            int rand = (int)(Math.random()*range+MIN);

            boolean condition1 = rand >= 65 && rand <= 90;
            boolean condition2 = rand >= 97 && rand <= 122;

            if(condition1||condition2){
                System.out.printf("랜덤으로 영문 소대문자 생성 : %c(%d)\n" , rand ,rand);
                isChar = false;
                break;

            }
            System.out.printf("문자가 생성 되지 않음 : %d\n" , rand);
        }

    }
}








