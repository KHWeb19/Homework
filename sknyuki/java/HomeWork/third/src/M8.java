public class M8 {
    public static void main(String[] args) {
        //2~10사이의 랜덤 숫자를 추출해내고 0~100까지의 배수들 구하기
        //구한 배수들의 합 구하기
        int random = (int) (Math.random()*9 + 2);
        for (int i=0; i<=100;i++){
            if(i%random==0){
                System.out.printf("2~10사이의 랜덤 숫자%d의 100까지의 배수는 %d이다\n.",random, i);
                //n번쨰 배수는 ran*n이다 라고 표현하고 싶을때는?




            }
        }
    }
}