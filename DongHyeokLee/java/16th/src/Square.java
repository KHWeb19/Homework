public class Square implements Runnable{

    int WIDTH = 2;
    final int HEIGHT = 2;
    final int AREA = WIDTH*HEIGHT;
    final float DIVIDE = 0.001f;
    float areaSum,sum;
    public Square(){
        sum = (WIDTH/DIVIDE);
    }

    @Override
    public void run() {

        for(int i = 0 ; i < sum; i++){

            areaSum += (WIDTH*DIVIDE);

        }
        System.out.println(areaSum);
    }
}
