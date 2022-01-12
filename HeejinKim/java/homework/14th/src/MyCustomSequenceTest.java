public class MyCustomSequenceTest {
    public static void main(String[] args) {
        final int ORDER=31;
        final int ORDER2=50;

        MyCustomSequence mcs= new MyCustomSequence(2);


        System.out.printf("2^%d=%d\n",ORDER-1,mcs.getGeoSeqNthOrderData(ORDER));
        System.out.printf("2^%d=%d\n",ORDER2-1,mcs.getGeoSeqNthOrderData(ORDER2));
        //getGeoSeqNthOrderData메소드 하나로 이 두개의 값을 내고 있음




    }


}
