public class Hw6 {
    // 1 ~ 100까지의 숫자 중 3의 배수만 출력
    public static void main(String[] args) {
        System.out.println("100이내의 3의 배수");
        int i = 0;
        while(i++<101){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
