public class ThreadQuadraticEquation extends ThreadManager implements Runnable {

    public ThreadQuadraticEquation(){
        super();
    }

    public static void calcEachThreadTotal(int start, int end){
        ThreadManager.calQuadraticThreadTotal(start, end);
    }


    public float getSum() {
        return sum;
    }

    @Override
    public void run() {
        float curX = dx * xStart;

        // y = x^2  높이값 curX * curX
        // 사각형의 넓이는 dx * y = dx * curX * curX
        for (int i = xStart; i <= xEnd; i++, curX += dx) {
            // 0.0001 = dx
            // curX = 2.5677
            // curX = 2.5677
            // 소수점 계산 특성: 소수점 4번째 자리숫자와 소수점 4번째 자리 숫자의 연산은 무엇을 만드나 ?
            // 소수점 8번째 자리의 결과를 만들어내게 됨
            // 다시 거기에 0.0001을 곱하니 소수점이 더 뒤로 밀려가게 되고
            // 데이터타입이 표시할 수 없는 소수점을 만들게 될 가능성이 높아짐
            // 이러한 사항이 한도를 넘어가게 되면 dx = 0.000001f과 같이
            // 납득하기 어려운 오차를 유발할 수 있다.
            sum += dx * curX * curX;
        }

        System.out.printf("sum = %.12f\n", sum);
    }


}
