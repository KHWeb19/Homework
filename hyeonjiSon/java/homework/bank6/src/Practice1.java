public class Practice1 {
    public static void main(String[] args) {
/*
        //처음엔 NormalBank 예시를 참고하여 만들어보려고 함

        Calculate cal = new Calculate();

        //RecDiv: 가로길이 2가 0이 될 때 까지 0.001로 나누어주는 과정을 거치도록 만든다.
        Thread t1 = new Thread(new Rectangle(cal, true, 2f)); //true면 나누기
        //RecSum: 모든 밑변들 * 2 를 전부 합산한 값을 구하도록 만든다.
        //이때 면적값들의 합산이 4에 근접하는지 확인한다.
        Thread t2 = new Thread(new Rectangle(cal, false, 2f)); //false면 더하기

        t1.start();
        t2.start();

//이렇게 만들면 발생하는 문제점.
//아마 t1과 t2가 순차적으로 돌아가지 않을 것이기 때문에 더하기가 먼저 진행되고 나누기가 나중에 진행되어서
//결과가 일정하게 도출되지 않을 것임.
//Thread를 1개로 만들 필요가 있음.
 */
        //계산에 공통적으로 필요한 숫자는... 가로 2(이건 0.001로 나눠줘야함), 세로 2

        Thread t1 = new Thread(new Rectangle(2, 2));

        t1.start();

   }
}




/*
1. 가로 길이 2, 세로 길이 2인 사각형의 넓이를 아래 방식을 통해 구해봅시다.

   사각형 넓이이니 모두들 면적값이 4라는 것을 알 수 있을것입니다.
          //(사각형 넓이 = 가로 * 세로)

   검토에 활용하도록 하시고요.

1-1. 가로 길이 2를 아주 작은값인 0.001로 나누어줍니다.
          // 0.001로 나눠야하니 float으로 값을 줘야겠네

1-2. 나누면 아주 작은값인 0.001이 몇 개 만들어지는지 알 수 있는데 저장하도록 합니다. (for문 돌려야겠죠 ?)

1-3. 이 아주 작은 밑변과 높이값인 2를 곱하면 작은 면적값을 얻을 수 있습니다.

1-4. 각각의 모든 작은 사각형들을 합산하여 면적값이 4에 근접하는지 확인하도록 합니다.

위 절차를 Thread를 활용해서 진행해보세요.
 */
