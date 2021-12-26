public class HW1 {

    /* 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.

   여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

​
[출처] 문제 은행 [ 2 ] (에디로봇아카데미) | 작성자 링크쌤*/

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
                   //문제가 알파벳이 아닌것은 다시 생성해야하니까 빠져나가지말고 다시 들어가서 생성되는게 이 식이 맞나??
                   //만약92가 나오면 나올때 까지 돌아가는 건가??

            }
        }
    }
}
