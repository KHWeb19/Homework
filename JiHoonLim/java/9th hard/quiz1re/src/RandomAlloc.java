import java.util.Arrays;

public class RandomAlloc {
    int [] iarr;
    float [] farr;
    double [] darr;

    int icnt, fcnt, dcnt;

    final int IMAX = 10 ;
    final int IMIN = 1 ;

    final float FDMAX = 10 ;
    final float FDMIN = -10 ;
    final int FDBIAS = 100;

    int irange ;
    float fdrange ;

    public RandomAlloc(int icnt, int fcnt, int dcnt) {
        this.icnt = icnt;
        this.fcnt = fcnt;
        this.dcnt = dcnt;

        iarr = new int[icnt];

        farr = new float[fcnt];

        darr = new double[dcnt];

        IntRange();
        FDRange();

    }

    public void IntRange() {
        irange = IMAX - IMIN + 1;

        IntAlloc();
    }

    public void FDRange() {
        fdrange = FDMAX * FDBIAS - FDMIN * FDBIAS + 1;

        FloatAlloc();
        DoubleAlloc();
    }

    public void IntAlloc() {
        for (int i = 0; i < icnt; i ++){
            iarr[i] = (int)(Math.random() * irange + IMIN);
            System.out.printf("정수 %d\n", iarr[i]);
        }
    }

    public void FloatAlloc() {
        for(int i = 0; i < fcnt ; i ++){
            farr[i] = (float)(Math.random() * fdrange);
            farr[i] = (farr[i] / FDBIAS) + FDMIN;
            System.out.printf("float 형 실수 %.2f\n", farr[i]);
        }
    }

    public void DoubleAlloc() {
        for(int i = 0; i < dcnt ; i ++){
            darr[i] = (Math.random() * fdrange);
            darr[i] = (darr[i] / FDBIAS) + FDMIN;
            System.out.printf("double 형 실수 %f\n", darr[i]);
        }
    }
}
