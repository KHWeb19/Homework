public class Homework8 {
    public static void main(String[] args) {
        //1~100까지 순회
        // 2~10사이의 랜덤한 숫자를 선택 이 숫자의 배수 출력

        final int MAX = 10, MIN = 2;
        int range = MAX - MIN +1;
        int ran = (int)(Math.random()*range+MIN);

        for(int i=1; i<=100; i++){

            if(i % ran == 0){
                System.out.println(ran + "의 배수 = " + i );
            }

        }

    }
}
