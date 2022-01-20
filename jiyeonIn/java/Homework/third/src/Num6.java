public class Num6 {
    public static void main(String[] args) {
        //6. 1~100 숫자중 3의 배수만 출력하기

        System.out.println("1~100 숫자중 3의 배수만 출력");
        for(int i=1;i<100;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
