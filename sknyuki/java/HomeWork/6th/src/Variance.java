public class Variance {

    static float var;
    int sum;
    static int[] arrayScore = {M5StudentClass.score1, M5StudentClass.score2, M5StudentClass.score3};

    public void initVariancescore() {
        sum=0;
        for (int i = 0; i < M5StudentClass.END; i++) {
            sum += Math.pow(arrayScore[i] -M5StudentAverage.scoreaverage , 2);
        }
        var=sum/M5StudentClass.END;
        System.out.printf("분산값은 %f입니다.\n",var);
    }
}
