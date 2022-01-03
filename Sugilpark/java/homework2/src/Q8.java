public class Q8 {
    public static void main(String[] args) {

        int rand1 = (int)(Math.random()*100+1);
        int num1 = 2;
        int num2 = 10 ;

        for(int i = 1; i <= 100; i++){
            if(i % rand1 == 0){
                System.out.println(rand1 + "의 배수 : "+i);
            }
        }
    }
}
