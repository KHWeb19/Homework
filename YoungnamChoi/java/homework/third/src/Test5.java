public class Test5 {
    public static void main(String[] args) {
        // 1~100까지 짝수 출력

        int i=1;
        while ( i<101){
            i++;
            if( i %2==0){
                System.out.printf("짝수 = %d\n", i);
            }
        }
    }
}
