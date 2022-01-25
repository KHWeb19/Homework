public class ThreadRectangle extends Thread{
//    개선사항
//    1. 스레드를 4개로 쪼개서 각각 계산되도록 해야한다.
//    - 4개로 쪼개서 각각의 전체 값을 구하자
//    - X의 시작값 끝값 구하자
//    2. 스레드가 동시에 작업되도록 객체화 해야한다.
//    - 스레드는 4개니까 객체배열을 썼으면 편했을텐데...
//    - run에서 배열의 원리(?)를 활용하자 (스레드가 실행되면 어차피 run이 돌아가니까)

    final static int X = 2;
    final int Y = 2;
    static float divide = 0.001f;

    private int startX, endX;
    final static int THREAD_MAX = 4;
    static int threadCount = 0;
    static int total, eachThreadTotal;
    static float sum;

    private int threadId; // 제대로 돌아가는지 검사하는 용도.
    // static으로 만들었드니 값이 쌓인채로 그대로 있었음


//    1-1. 가로 길이 2를 아주 작은값인 0.001로 나누어줍니다.
//    1-2. 나누면 아주 작은값인 0.001이 몇 개 만들어지는지 알 수 있는데 저장하도록 합니다. (for문 돌려야겠죠 ?)

    public ThreadRectangle(){  // 4번이 실행되어야 한다.
        threadId = threadCount++;
        startX = threadId * eachThreadTotal;
        endX = ((threadId + 1) * eachThreadTotal) - 1;
        System.out.println(threadCount + " = " + startX + ", " + endX);
    }

    public static void calcEachThreadTotal(){
        total = (int) (Math.ceil(X / divide)); // 여기서 올림 해야함 ceil()
        eachThreadTotal = total / THREAD_MAX; //499
//        System.out.println(total+ ", " + eachThreadTotal);
    }


//    1-3. 이 아주 작은 밑변과 높이값인 2를 곱하면 작은 면적값을 얻을 수 있습니다.
//    1-4. 각각의 모든 작은 사각형들을 합산하여 면적값이 4에 근접하는지 확인하도록 합니다.

    public static float getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = startX; i <= endX; i++){
            sum += divide * Y;
            System.out.printf("number = %d, sum = %f \n", threadId, sum);
        }
    }


}
