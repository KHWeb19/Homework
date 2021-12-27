public class Hw8 {
    public static void main(String[] args) {
        // 2~10사이의 랜덤한 숫자 뽑기
        int min = 2;
        int max = 10;
        int range = (max - min)+ 1;
        int rand = (int)(Math.random() * range + min);

        //1~100까지 숫자 순회
        for(int i=1 ; i<=100 ; i++){
            if(i % rand == 0){

                System.out.println(rand + "의 배수 : " + i);
            }
        }

    }
}
