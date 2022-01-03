public class Hw5 {
    // 1 ~ 100까지의 숫자 중 짝수만 출력
    public static void main(String[] args) {
        System.out.println("100이내의 짝수");
        int i = 0;
        while(i++<101){
            if(i%2==0){
                System.out.printf("%d\n",i);
            }
        }
    }
}
