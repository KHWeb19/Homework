public class Num8 {
    public static void main(String[] args) {
        //8. 1~100까지의 숫자를 순회한다.
        // 2~10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

//        final int MAX = 10;
//        final int MIN = 2;
//        int rand =(int)(Math.random()*(MAX-MIN+1)+MIN);
//
//        System.out.println("선택한 값 : "+rand);
//        System.out.println(rand+"의 배수");
//
//        for(int i= 1;i<=100;i++){
//            if(i%rand==0){
//                System.out.println(i);
//            }
//
//        }

        //for이나 while문 안에 랜덤문 생성하면 반복하면서 랜덤값이 바뀌는것같은데,, 넣어서도 할수 있는 방법이 있을까요?

        final int MAX = 10;
        final int MIN = 2;
        int rand =(int)(Math.random()*(MAX-MIN+1)+MIN);
        int num = 0;

        System.out.println("선택한 값 : "+rand);
        System.out.println(rand+"의 배수");

        while (num++<=100){
            rand =(int)(Math.random()*(MAX-MIN+1)+MIN);
            if(num%rand==0){
                System.out.println(num);
            }
        }

    }
}
