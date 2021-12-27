public class Homework10 {
    public static void main(String[] args) {
        //1~100까지 숫자를 순회
        //9번과 유사하게 2~10가지고 작업
        // 배수 찾기 x 랜덤한 숫자가 나온만큼만 이동하고 이동했을때 나온 숫자들의 합을 계산->1부터 이동인가
        //머선소리고...two
        //랜덤한 숫자만큼 이동해서 이걸 더하고 이게 100을 넘으면 안되는건가????

        final int MAX = 10, MIN = 2;
        int range = MAX - MIN + 1;
        //int ran = (int) (Math.random() * range + MIN);

        for (int i = 1; i <= 100; i++) {


            int ran = (int) (Math.random() * range + MIN);
               i += ran;

               if(i<=100){
                   System.out.println(ran + "만큼 이동 = " + i); // 최종적으로 100이 넘어버림 if문사용??
               }else{
                   System.out.println("더 이상 이동할 수 없습니다.");
               }
        }




    }
}
