public class Q4 {
    public static void main(String[] args) {

        // 구구단 7단을 출력해보자
         int i = 0;

         while (i<64) {
             i++;
             if (i % 7 ==0) {
                 System.out.printf("7의 배수 = %d\n", i);

             }
         }
    }
}
