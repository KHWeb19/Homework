public class P07 {
    public static void main(String[] args) {

        int i = 0;

        int sumNum = 0;

        while(i++<101){
            if(i%4==0){
                System.out.println("4의 배수 = "+i);
                sumNum += i;
                System.out.println("현재까지의 합 = "+sumNum);
            }
        }
        System.out.println("1~100까지의 숫자 중 4의 배수들의 합 = "+sumNum);
   }
}
// 답과 차이점 : final int로 시작,끝,n의 배수, 나머지 등을 선언했는지 차이