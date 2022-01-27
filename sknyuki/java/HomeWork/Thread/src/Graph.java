public class Graph {
    /*
2-1. 마찬가지로 0.001로 잘게 쪼갭니다.

2-2. 동일하게 개수를 파악합니다.

2-3. 앞서 사각형 케이스와 다르게 높이값이 현재의 x값에 따라서 변함에 주의합시다.

2-4. 작은 사각형들의 넓이를 계산합니다.

2-5. 모든 작은 사각형들의 넓이를 계산해봅시다.

2-6. x의 시작은 0부터 마지막은 3까지 진행해봅시다.

2-7. 결과는 9에 근접하게 나오면 성공입니다.
  */
        //가로 변 길이 width값 -> "3", Height -> "X값^2"
        //이번엔 y값이 X값에 따라서 변동하는 구조이기에 X좌표 값의 배열을 만들어준다.
        //X의 좌표값은 XValue[i-1]+0.0001해주는 식으로 구할 수 있을 것이다(for).
        //y좌표의 값 XValue[i]^2.
        //매 순간의 넓이 면적=YValue[i]-YValue[i-1]
        //면적의 합 면적+=면적[i]

        //thread..이전과 같은 방식이라면 제어권이 수시로 넘어가는 구조가 아니라서 thread를 사용하는 의미가 없어진다.
    //어떻게?

    public static void main(String[] args) {

        ClaculateManager2 cm2 = new ClaculateManager2(3);
        cm2.XValue();
        cm2.YValue();
        cm2.SmallSquare();
    }
}
