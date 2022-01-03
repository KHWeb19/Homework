public class Hw8 {
    // 1 ~ 100까지의 숫자를 순회, 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력
    public static void main(String[] args) {
        int i;
        int rand;
        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;
        rand = (int) (Math.random() * range + MIN);
        System.out.println("랜덤한 숫자: " + rand);
        for(i=0;i<101;i++){
            if(i%rand==0){
                System.out.printf("%d의 배수  = %d\n",rand, i);
            }
        }
    }
}
