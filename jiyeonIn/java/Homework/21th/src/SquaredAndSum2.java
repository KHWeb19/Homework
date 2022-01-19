public class SquaredAndSum2 extends XYvalue implements Runnable {
    final static float BASIC = 0.001f;
    private float squaredStanderd2;
    private static int count;
    private XYvalue[] xy;
    //x와 y를 나눠서 값을 도출 후, 그 값을 곱하는 형식으로 만들어보고 싶음.
    //이렇게 만들어보고 싶은 이유는 0.001이 critical section이 되어서 lock 을 만들어보고 싶음.(그럼, +0.001 전에 lock을 걸어야한다.)
    // -> x,y이중배열 만들고 싶긴한데. 그러면 critical section을 쓸 수 없다.
    //x배열, y배열, 그걸 곱한 값의 배열 총 3개의 배열을 만들어야할까? -> 이건 답이 아니였음. 이렇게 되면 여기서도 반복문을 쓰니까 3000 * 3000번이 반복 되는꼴.
    // --> 객체배열을 썼기 때문이다. 어레이리스트로도 만들어보고싶었는데 add 를 3000번 할 자신이 없다. 혹시 add를 안하고 for문으로도 값을 입력할 수 있나요?


    public SquaredAndSum2(int squaredStanderd2) {
        this.squaredStanderd2 = squaredStanderd2;
        count = (int) (squaredStanderd2 / BASIC) + 1; // 3천번 반복하는 카운트 체크 완료 /
        xy = new XYvalue[count];

    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run() {
        try {
            for(int i=0 ; i < count ; i++){
                System.out.printf("x = %.4f, y= %.4f, 값 = %.4f\n" , xlineValue(), ylineValue(), multyValue());
                Thread.sleep(5);//결과 값 8.9998, 도출완료
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

