public class Quiz1 extends Thread {
    final double DIVISION = 0.01 ;

    private int width;
    private int column;

    private int widthCnt;

    private double sumarea;

    private double [] arrwidth;
    private double [] area;

    // 가로 세로 받아옴
    public Quiz1(int width, int column){
        this.width = width;
        this.column = column;

    }

    public void divisionWidth(){
        // 가로를 나눔 = 0.01 짜리 200개
        widthCnt =  (int) (width / DIVISION);

        // 가로 배열 200개 생성
        arrwidth = new double[widthCnt];

        // 200개의 가로값 배열에 0.01 넣는다
        for (int i = 0; i < widthCnt; i ++){
            arrwidth[i] = DIVISION;
        }
    }

    public void calcQuadrangle(){
        //면적 배열
        area = new double[widthCnt];

        // 면적 배열에 200개의 면적값을 저장
        for (int i = 0 ; i < widthCnt; i ++) {
            area[i] = column * arrwidth[i];
        }

        //면적값 4의 근접하게
        try{
            sumarea = 0;

            for (int i = 0 ; i < widthCnt; i ++){
                sumarea += area[i];
                System.out.println(sumarea);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
                System.out.println(sumarea);
        }
    }

    public void run(){
        divisionWidth();
        calcQuadrangle();
    }
}
