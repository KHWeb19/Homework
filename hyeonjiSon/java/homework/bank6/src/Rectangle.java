public class Rectangle implements Runnable {
    final double DIVNUM = 0.001;
    private double width;
    private double height;
    double widthCnt;
    private double sum;

    private double [] arrWidth;
    private double [] arrArea;

    //1.main의 값을 받는 메서드를 만들어준다.
    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

//1-1. 가로 길이 2를 아주 작은값인 0.001로 나누어줍니다.
    // 0.001로 나눠야하니 float으로 값을 줘야겠네
//1-2. 나누면 아주 작은값인 0.001이 몇 개 만들어지는지 알 수 있는데 저장하도록 합니다. (for문 돌려야겠죠 ?)
    public void divWidth(){
        widthCnt = width / DIVNUM; //widthCnt = 2를 0.001로 나눈 값 = 2000

        arrWidth = new double[(int) widthCnt]; // 2000개 배열의 array 생성

        for(int i = 0; i <=widthCnt; i++){
            arrWidth[i] = DIVNUM; //2000개의 arrWidth[i] 배열에 0.001이라는 값을 넣어줌
        }
    }

//1-3. 이 아주 작은 밑변과 높이값인 2를 곱하면 작은 면적값을 얻을 수 있습니다.
    public void saveArea(){
        //2000개의 면적값을 우선 저장해주어야 한다.
        arrArea = new double[(int) widthCnt];

        for(int i = 0; i <=widthCnt; i++) {
            arrArea[i] = arrWidth[i] * height;
        }
    }

    //1-4. 각각의 모든 작은 사각형들을 합산하여 면적값이 4에 근접하는지 확인하도록 합니다.
    @Override
    public void run() {
        for(int i = 0; i <= widthCnt; i++){
            sum += arrArea[i];
        }
        System.out.println("모든 작은 사각형들을 합산한 면적값 : " + sum);
    }
}
