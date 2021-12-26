public class Num5 {
    public static void main(String[] args) {
        //5. 1~100까지 숫자중 짝수만 출력해보자

        System.out.println("1~100까지의 짝수 출력");

        for(int i =1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
