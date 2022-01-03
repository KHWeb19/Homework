public class P04 {
    public static void main(String[] args) {

        int res;

        for(int i=7;i<8;i++){
            System.out.printf("구구단 %d단을 출력합니다.\n",i);
            for(int j=1;j<10;j++){
                res = i * j;
                System.out.printf("%d x %d = %d\n",i,j,res);
            }
        }
    }
}
