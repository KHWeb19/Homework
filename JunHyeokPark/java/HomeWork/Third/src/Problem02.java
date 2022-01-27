public class Problem02 {
    public static void main(String[] args) {
        int i = 0;  int a = 1; int b = 1; int c ; int f = 0;
        while (i++ < 20){
            c = a + b;
            System.out.println(a);
            f = a; a = b ; b = c ;
        }
        System.out.printf("수열의 20번재 항은 %d 입니다." ,f);
    }
}
