public class M3Class {
    /*   1,1,1,2,3,4,5,6,13,19,28,41,60,88,129...
           -> A(n)=a(n-3)+a(n-1)
           25번째항=>(25-3)번째항+(25-1)번째항

        */

    int sum;
    int a1 = 1;
    int a2 = 1;
    int a3 = 1;

    public void printNum() {
        //a4=a1+a3
        //a5=a2+a4

        for (int i = 0; i < 25 - 3; i++) {
            //25-3인 이유 3항까지 1이기에 -3
            sum = a1 + a3;
            a1 = a2;
            a2 = a3;
            a3 = sum;
            System.out.printf("해당 수열 %d번째 항은 %d입니다.\n", i + 4, sum);
        }
    }
}