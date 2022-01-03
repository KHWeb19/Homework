public class Question7 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <=100; i++){
            if(i % 4 ==0 ){
                System.out.println("4의 배수 =" + i);

               sum =+i;

            }
        }
        System.out.println("1부터 100까지 4의 배수들의 합은 " + sum);
// 1부터 100까지의 합이 100이 나옵니다.
    }
}
