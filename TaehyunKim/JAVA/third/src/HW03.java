public class HW03 {
    public static void main(String[] args) {
        // 1,1,1,2,3,4,6,9,13,19,28,41,60,88,129 의 규칙을 찾아 25번째 항을 구하기

        int a=1,  b=1 , c=1;
        System.out.print("1, 1, 1, ");
        for (int i=0; i<22; i++){
            int k = a+c;
            a=b;
            b=c;
            c=k;
            if (i!= 21){
                System.out.printf("%d, ", k);

            }
            else{
                System.out.printf("%d", k);
            }
        }

    }
}
