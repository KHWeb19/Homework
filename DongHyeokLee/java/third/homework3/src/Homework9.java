public class Homework9 {
    public static void main(String[] args) {
        //1~100까지 숫자 순회
        // 2~10 사이의 랜덤한 숫자 선택 이 숫자의 배수 출력
        // 다음 루프에서 다시 랜덤 숫자 선택 해당 숫자 배수 출력
        //그 다음 루프에서 다시 작업 반복
        //끝까지 순회 했을때 출력된 숫자들의 합 => 끝까지??
        //머선소리고...

        final int MAX = 10, MIN = 2;
        int range = MAX - MIN + 1;
        //int ran = (int) (Math.random() * range + MIN);// 초기화 안 됌
        int sum = 0; //초기화 선언 해야함


       //Q. 안나온 숫자들로만 계속 더해보고싶은데...
        //Q.무한루프를 어떻게 끝내지
        int i = 1;
        while(true){
            int ran = (int) (Math.random() * range + MIN);


            while(i<=100){
                if(i % ran == 0){
                    System.out.println(ran + "의 배수 = " + i );
                    sum += i;
                }
                i++;

            }
              i =1; // i 초기화하니 무한루프?함
            System.out.println("지금 까지 출력된 숫자들의 합" + sum);
        }



    }
}