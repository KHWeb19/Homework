public class Problem08 {
    public static void main(String[] args) {
        int i = 0; int rand = (int)(Math.random()*9+2);
        while (i++<100){
           if (i % rand == 0){
               System.out.printf("%d의 배수 %d 입니다.\n", rand, i);
           }
        }

    }
}
