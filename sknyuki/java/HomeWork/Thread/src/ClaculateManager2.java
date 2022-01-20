public class ClaculateManager2 extends XSquared implements Runnable {
    int Count;
    double[] XValueArray;
    double[] YValueArray;
    double XvalueSum;
    double Area;

    public ClaculateManager2( double Width) {
        super( Width);


    }

    public void XValue(){
        Count=(int)(Width/SplitNumber)+1;
        XValueArray=new double[Count];

        for(int i=1; i<Count; i++){
            XValueArray[i]=XValueArray[i-1]+SplitNumber;
           //System.out.printf("%d 번째 X좌표값:%.2f\n",i,XValueArray[i]);
            //System.out.println(Count);
        }
    }
    public void YValue(){
        YValueArray=new double[Count];
        for(int i=1;i<Count;i++) {
            YValueArray[i] = Math.pow(XValueArray[i], 2);
          // System.out.printf("%d 번째 Y좌표값:%.2f\n",i,YValueArray[i]);
        }
    }

    public void SmallSquare(){
            Area=0;
            for(int i=1;i<Count;i++){
            Area+=YValueArray[i]-YValueArray[i-1];
           // System.out.printf("X좌표 %d번째 까지의 면적:%.2f\n",i,Area);

        }
        System.out.printf("x좌표 %.2f까지의 면적:%.2f\n",Width,Area);
    }

    @Override
    public void run() {
    }
}
