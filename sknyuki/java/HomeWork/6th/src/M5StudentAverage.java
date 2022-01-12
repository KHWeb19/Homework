public class M5StudentAverage {
    static int scoreaverage;

    public void initaverage()
    { scoreaverage= (M5StudentClass.score1+ M5StudentClass.score2+ M5StudentClass.score3)/M5StudentClass.END;
        System.out.printf("평균값은 %d이다\n",scoreaverage);
        //점수를 불러오는 방식이 잘 못되었나요?
        //M5StudentClass에서 score1,2,3들이 사용된적이 없다고 합니다.

}
}
