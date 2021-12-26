public class Homework1 {
    public static void main(String[] args) {
        //65~122사이의 랜덤문자 생성
        //소문자 대문자 아닐시 다시 생성

        final int MAX = 122 , MIN = 65;
        int range = MAX - MIN + 1;

        boolean bl = true;


        while(bl){
            int rand = (int)(Math.random()*range+MIN);

            if(rand >= 65 && rand <=90){
                System.out.printf("rand = %c\n", rand);
                bl = false;
            }else if(rand >=97 && rand <=122){
                System.out.printf("rand = %c\n", rand);
                bl = false;
            }else{
                System.out.println("다시 생성하시오");
            }

        }

    }
}




