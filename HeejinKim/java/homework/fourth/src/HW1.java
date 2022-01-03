public class HW1 {



    public static void main(String[] args) {

        int max = 122;
        int min = 66;
        int range = max - min + 1;

        boolean eng = true;

        while (eng) {
            int rand = (int) ((Math.random() * range) + min);

             boolean condition1 = (rand >= 65) && (rand <= 90);//생성된 rand가 소문자
             boolean condition2 = (rand >= 97) && (rand <= 122);//생성된 rand가 대문자

               if( (condition1)||(condition2) ){ //생성된 rand가 소문자이거나 대문자 이면 if문 안으로 들어감
                   System.out.printf("%c는 문자 입니다.",rand);
                   eng = false;


            }
        }
    }
}
