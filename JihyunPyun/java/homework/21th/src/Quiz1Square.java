public class Quiz1Square implements Runnable{
    final private double DIVIDE = 0.001;
    private int width, height;
    private double widthCalc, sum, check;

    private double widthArr[], areaArr[];


    public Quiz1Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

//    1-1. 가로 길이 2를 아주 작은값인 0.001로 나누어줍니다.(widthCalc)
//    1-2. 나누면 아주 작은값인 0.001이 몇 개 만들어지는지 알 수 있는데 저장하도록 합니다.(배열에)

    public void divideWidth(){
        widthCalc = width / DIVIDE;
        widthArr = new double[(int) widthCalc];
        //값 저장
        for (int i = 0; i < widthCalc; i++){
            widthArr[i] = DIVIDE;
        }
    }


//    1-3. 이 아주 작은 밑변과 높이값인 2를 곱하면 작은 면적값을 얻을 수 있습니다.
//    -> 위에 넣어놓은 배열에서 하나씩 꺼내자. 그리고 높이만큼 곱함 (결과값은 areaArr에 넣자)
    public void calcArea(){
        areaArr = new double[(int) widthCalc];
        for (int i = 0; i < widthCalc; i++){
            areaArr[i] = widthArr[i] * height;
        }
    }


//1-4. 각각의 모든 작은 사각형들을 합산하여 면적값이 4에 근접하는지 확인하도록 합니다.
//    -> 아까 저장해둔거 꺼내서 합산하자
    public void calcSum(){
        for (int i = 0; i < widthCalc; i++){
            sum += areaArr[i];
        }
    }

//    4에 근접한지 판단하기 위해서 반올림
    public void sumRound(){
        check = Math.round(sum);
    }


    @Override
    public void run() {
        divideWidth();
        calcArea();
        calcSum();
        sumRound();

        if (check == 4){
            System.out.println("4에 근접");
        }
    }
}
