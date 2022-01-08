public class MyCustomSequenceTest {
    public static void main(String[] args) {
        int [] arr={1,1}; //초기항 설정

        MyCustomSequence mcs=new MyCustomSequence(arr,0); //바이어스는 필요없음
        System.out.println("20번째 데이터= "+ mcs.getNthOrderData(20));//사용자가 필요한 정보를 찾아야함

        int[] arr2 = { 1, 1, 1, 2 };

        MyCustomSequence mcs2 = new MyCustomSequence(arr2, 1);//3개만 더하도록
        System.out.println("25번째 데이터 = " + mcs2.getNthOrderData(25));




    }


}
