public class Num10 {
    public static void main(String[] args) {
        //10. 1~100까지 숫자를 순회, 9번과 유사하게 2~10 랜덤으로 작업 진행
        //다만 이번에는 배수가 아닌 랜덤한 숫자가 나온만큼만 이동하고
        //이동했을때 나온 숫자들의 합을 계산해보자

        /*
        1.2~10사이 랜덤 숫자 선택
        2.for문 통해 1~100반복
        3.랜덤 숫자가 나온 값만큼 이동 --> 이전 값+랜덤 값을 말하는건가??
        4.나온 값들의 합.
         */



//        final int MAX = 10;
//        final int MIN = 2;
//        int sum1 = 0;
//        int sum2 = 0;
//
//        for(int i= 1;i<=100;i++) {
//            int rand =(int)(Math.random()*(MAX-MIN+1)+MIN);
//            System.out.println(i+"번째 랜덤값 :"+rand);
//            System.out.println(i+"번째 이동 : " +sum1+"\n");
//            sum1 += rand;
//
//            sum2 +=sum1;
//        }
//        System.out.println("총 합 : "+sum2);

        // 다시풀기
        /*순서 1 : 1~100까지 순서 ->for문 사용
        2. 2~10 랜덤 문 사용 -> 진행할때마다 랜덤 값이 달라져야하니, for문 안에 배치해야한다.
        3. 랜덤 수가 나온만큼 이동한다. 1~100 사이안에서 랜덤 값이 더해져야 하니, 증감에 i++대신 i+랜덤 값으로 정한다.
        4. 그 값을 더한다.
         */

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN +1;
        int rand = 0;

        int sum = 0;
        final int START = 1;
        final int END = 100;

        for(int i = START; i<=END; i+=rand){
            rand = (int) (Math.random()*range + MIN);
            System.out.printf("위치 : %d, 랜덤값 : %d\n",i,rand);
            sum+=i;
        }
        System.out.printf("총 합은 %d",sum);




    }
}
