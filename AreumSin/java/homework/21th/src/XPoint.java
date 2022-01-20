public class XPoint implements Runnable{

    private int count;
    private int xPoint;
    private int yPoint;
    private boolean isCheck;
    private Area area;
    private final double num = 0.001;

    public XPoint(Area ar, int xPoint, boolean isCheck){
        this.xPoint = xPoint;
        this.isCheck = isCheck;
        area = ar;

    }

    @Override
    public void run() {
        if(isCheck) {
            yPoint = xPoint;
            count = (int)(xPoint/num);
            area.run(count, xPoint, yPoint);
            System.out.println("a : "+area.getArea());

        }else{
            for(int i = 1; i< 4; i++){
                xPoint = i;
                yPoint = i*i;
                count = (int)(xPoint/num);
                area.run(count, xPoint, yPoint);
                System.out.println("a1 : "+area.getArea());
            }
        }
    }
}
