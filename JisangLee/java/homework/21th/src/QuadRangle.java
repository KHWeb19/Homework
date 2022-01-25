import jdk.swing.interop.SwingInterOpUtils;

public class QuadRangle extends Thread {
    //1. 가로 길이 2, 세로 길이 2인 사각형의 넓이를 아래 방식을 통해 구해봅시다.
    //   사각형 넓이이니 모두들 면적값이 4라는 것을 알 수 있을것입니다.
    //   검토에 활용하도록 하시고요.
    //1-1. 가로 길이 2를 아주 작은값인 0.001로 나누어줍니다.
    //1-2. 나누면 아주 작은값인 0.001이 몇 개 만들어지는지 알 수 있는데 저장하도록 합니다. (for문 돌려야겠죠 ?)
    //1-3. 이 아주 작은 밑변과 높이값인 2를 곱하면 작은 면적값을 얻을 수 있습니다.
    //1-4. 각각의 모든 작은 사각형들을 합산하여 면적값이 4에 근접하는지 확인하도록 합니다.

    static final double INTERVAL = 0.001;
    static int height,width,quantity;

    public QuadRangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    static double[] area;
    static double totalarea;

    public void calcQuadRangle() {

        quantity = (int) (width / INTERVAL);

        for (int i = 0; i < quantity; i++) {
            double[] area = new double[(int) quantity];

            area[i] = height * INTERVAL;
            System.out.printf("작은 사각형의 넓이[%d] = %f\n", i, area[i]);
            totalarea += area[i];
        }
        System.out.printf("큰 사각형의 넓이: %.1f ", totalarea);
    }

    @Override
    public void run() {
        calcQuadRangle();
    }

}






