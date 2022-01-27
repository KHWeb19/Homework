public class Area {
    //가로 세로 2* 2 =4 인 사각형 넗이 구하기
    //2를 0.001로 나누고 몇개 만들어지는 지 알수있게 저장 하여 2를 곱하여 면적값 계산
    // 1. 2/0.001 = piece
    // 2. piece를 for 문에서 add 하여 더하기
    // 3. for문에는(쓰레드로 만들기) add 메소드만 넣어주기 //스레드에 add도 넣어주면 안되나??
    // 4.critical section이 있는지 찾아보기 .. 없음 그냥 lock 안걸어줘도 될듯


    public double width;
    public double height;
    public double slice;
    public double divide;
    public double tract;


    public Area(final double WIDTH, final double HEIGHT, final double SLICE){

        //여기서 값을 받아와서 계산하고 다시 돌려줌

        this.width=WIDTH;
        this.height=HEIGHT;
        this.slice=SLICE;
        double tract;
        isDivide();
       // sumArea(); //여기를 해제하고 주석처리한 값과 주석처리하지 않은 값이 다름
    }


    public void isDivide () {
        divide = width / slice;
    }

    public void sumArea(){
        try{
            tract = tract + (slice*height);
            System.out.println("면적의 합: "+tract);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDivide(double divide) {
        this.divide = divide;
    }

    public double getDivide() {
        return divide;
    }

    public double getTract() {
        return tract;
    }
}
