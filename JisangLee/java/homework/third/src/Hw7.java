public class Hw7 {
    // 1 ~ 100까지의 숫자 중 4의 배수를 더한 결과를 출력
    public static void main(String[] args) {
        System.out.println("100이내의 4의 배수의 합");
        int i = 0, sum = 0;
        while(i++<101){
            if(i%4==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
