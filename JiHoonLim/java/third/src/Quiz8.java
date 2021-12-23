public class Quiz8 {
    public static void main(String[] args) {

        int i ;
        int rand = (int)(Math.random()*9+2);
        System.out.println("랜덤으로 선택한 수는 " +rand);

        for (i = 1; i <=100; i++){
            if (i % rand == 0){
                System.out.println("1~100사이 선택한 수의 배수" +i);
            }
        }
    }
}
