public class OneHundred {
    final int START = 0;
    final int END = 100;

    final int MAX = 10;
    final int MIN = 2;

    int rand, range, i, sum;
    public void init_Oh(){
        range = MAX - MIN +1;

        for(i =START; i <= END; i+= rand) {
            rand = (int) (Math.random() * range + MIN);
            Oh();
            //System.out.println("for문 다시");
        }
    }

    public void Oh(){
        System.out.println("이동할 자릿 수 >> " + rand);
        sum += rand;
        System.out.println("이동한 자리 >>" + sum);
    }
}
