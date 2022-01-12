public class P03 {
    public static void main(String[] args) {
        //1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
        //초황금 수열(supergolden sequence)
        //처음 세 항은 1이고, 다음 항의 값은 바로 이전 항과 이전 항보다 2개 전 항을 더한 값이다.

        int sGolden1 = 1;
        int sGolden2 = 1;
        int sGolden3 = 1;
        int sGolden4;

        System.out.printf("초황금 수열의 1번째 항 = %d\n",sGolden1);
        System.out.printf("초황금 수열의 2번째 항 = %d\n",sGolden2);
        System.out.printf("초황금 수열의 3번째 항 = %d\n",sGolden3);

        for(int i=4;i<26;i++)
        {
            sGolden4 = sGolden3 + sGolden1;
            System.out.printf("초황금 수열의 %d번째 항 = %d\n",i,sGolden4);
            sGolden1 = sGolden2;
            sGolden2 = sGolden3;
            sGolden3 = sGolden4;
        }
    }
}
