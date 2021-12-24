public class Test7 {
    public static void main(String[] args) {
        //1~100 의 숫자 중 4의 배수를 더한 값 출력

        int sum = 0;

        for( int i =1; i<=100; i++){
            if( i %4==0){
                sum+= i;
            }
        }
        System.out.println("4의 배수의 합은" +sum);
    }
}
