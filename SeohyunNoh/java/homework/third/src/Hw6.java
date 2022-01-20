public class Hw6 {
    public static void main(String[] args) {
        System.out.println("<1부터 100중 3의 배수>");

        for(int i=1; i<=100 ; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
