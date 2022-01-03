public class Problem03 {
    public static void main(String[] args) {
        int i = 0; int a = 1; int b = 1; int c = 1;
        int d; int e = 0;
        while (i++ < 25) {
            d = a + c;
            System.out.println(a);
            e = a ; a = b ; b = c ; c = d ;
        }
        System.out.printf("수열의 25번째 항은 %d 입니다.",e);
    }
}