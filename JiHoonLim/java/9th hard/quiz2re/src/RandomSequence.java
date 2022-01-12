public class RandomSequence {
    final int PBSTART = 2;
    final int QUIZ3ARR = 3;
    int want;

    int first, second, third;
    int sum;
    int [] sq1;

    public RandomSequence(int want) {
        this.want = want;

        sum = 0;
        sq1 = new int[want];
    }

    public void PiboArr() {
        first = 1 ;
        second = 1 ;
        System.out.printf("1 항 = %d \n", first);
        System.out.printf("2 항 = %d \n", second);

        for (int i = PBSTART; i < want ; i ++){
            sq1[i] = first + second ;
            first = second ;
            second = sq1[i] ;
            System.out.printf("%d 항 = %d \n", i+1  ,sq1[i]);
        }
    }

    public void Quiz3Arr() {
        first = 1;
        second = 1;
        third = 1;
        System.out.printf("1 항 = %d \n",first);
        System.out.printf("2 항 = %d \n",second);
        System.out.printf("3 항 = %d \n",third);

        for (int i = QUIZ3ARR; i < want; i ++) {
            sq1[i] = first + third;
            first = second ;
            second = third ;
            third = sq1[i];
            System.out.printf("%d 항 = %d \n", i+1, sq1[i]);
        }
    }
}
