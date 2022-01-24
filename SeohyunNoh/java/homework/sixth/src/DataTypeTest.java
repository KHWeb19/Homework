public class DataTypeTest {
    public static void main(String[] args) {
        DataType dtt = new DataType(1, 2, 3);

        dtt.allocRandom();
        System.out.println(dtt);

        System.out.println();

        DataType dtt2 = new DataType(2, DataType.INT_PROC);
        dtt2.allocIntRandom();
        System.out.println(dtt2);

        DataType dtt3 = new DataType(2, DataType.FLOAT_PROC);
        dtt3.allocFloatRandom();
        System.out.println(dtt3);

        DataType dtt4 = new DataType(2, DataType.DOUBLE_PROC);
        dtt4.allocDoubleRandom();
        System.out.println(dtt4);
    }
}
