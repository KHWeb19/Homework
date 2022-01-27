public class SquareAreaStart {
    public static void main(String[] args) {
        //1. 가로 길이 2, 세로 길이 2인 사각형의 넓이를 아래 방식을 통해 구해봅시다.
        //   사각형 넓이이니 모두들 면적값이 4라는 것을 알 수 있을것입니다.
        //   검토에 활용하도록 하시고요.
        //1-1. 가로 길이 2를 아주 작은값인 0.001로 나누어줍니다
        //1-2. 나누면 아주 작은값인 0.001이 몇 개 만들어지는지 알 수 있는데 저장하도록 합니다. (for문 돌려야겠죠 ?)
        //1-3. 이 아주 작은 밑변과 높이값인 2를 곱하면 작은 면적값을 얻을 수 있습니다.
        //1-4. 각각의 모든 작은 사각형들을 합산하여 면적값이 4에 근접하는지 확인하도록 합니다.
        //위 절차를 Thread를 활용해서 진행해보세요.


        //사각형을 담당하는 클래스를 만든다.
        //가로변과 세로변의 변수를 만들어준다.
        //가로의 길이를 0.001로 나눈후 값을 array에 저장을 해준다
        //for문을 돌려주면서 세로 길이와 array의 인덱스들을 곱해준다
        //위 값을 더한다.

        //critical Section 영역의 정보?=>2의 길이를 1과 1로 구역을 나눠서 공통된 sum값에 thread로 추가해 가는 형식이라면?


       Thread t1=new Thread( new CalculateManager(2,2));
       Thread t2=new Thread( new CalculateManager(2,2));
        CalculateManager.splitwidth1();
        CalculateManager.splitwidth2();
       t1.start(CalculateManager.arraywidth1);
       t2.start(CalculateManager.arraywidth2);
       CalculateManager.printTotalSum();


    }
}
