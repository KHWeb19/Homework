public class Num7 {
    public static void main(String[] args) {
        //7. 1~100까지 중 4의 배수를 더한 값을 결과를 출력

        int sum = 0;

        for(int i =1; i<=100;i++){
            if(i%4==0){
                sum+=i;
            }
        }

        System.out.println("1~100까지 중 4의 배수를 더한 값:"+sum);
    }
}
