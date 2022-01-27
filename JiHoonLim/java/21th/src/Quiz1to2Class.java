public class Quiz1to2Class {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.  가로 길이 2, 세로 길이 2인 사각형의 넓이를 아래 방식을 통해 구해봅시다.
            사각형 넓이이니 모두들 면적값이 4라는 것을 알 수 있을것입니다.
            검토에 활용하도록 하시고요.
            1-1. 가로 길이 2를 아주 작은값인 0.001로 나누어줍니다.
            1-2. 나누면 아주 작은값인 0.001이 몇 개 만들어지는지 알 수 있는데
            저장하도록 합니다. (for문 돌려야겠죠 ?)
            1-3. 이 아주 작은 밑변과 높이값인 2를 곱하면 작은 면적값을 얻을 수 있습니다.
            1-4. 각각의 모든 작은 사각형들을 합산하여 면적값이 4에 근접하는지 확인하도록 합니다.
         */
        Quiz1to2 quiz1to2;

        // 문제 1번
        Thread t1 = new Thread(new Quiz1to2(2,2,1));
        t1.start();

        //문제 2번
        // 0~ 3까지 세로 높이 입력해야함 ( int 로만)
        Thread t2 = new Thread(new Quiz1to2(1,3,2));
        t2.start();

        // 대기
        t1.join();
        t2.join();

    }
}
