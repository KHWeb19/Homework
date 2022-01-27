public class MyCustsomSequenceTest {
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!

    // 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
    //

    public static void main(String[] args) {
        int[] arr = { 1, 1};

        MyCustomSequence mcs = new MyCustomSequence(arr, 0); // 길이가 2인 1번의 1번 하는 중.
        System.out.println(mcs.getNthOrderData(20));

        int[] arr2 = {1, 1, 1, 2};
        MyCustomSequence mcs2 = new MyCustomSequence(arr2, 1); // 길이가 3인 1번의 2번 하는 중.
        System.out.println(mcs2.getNthOrderData(25));

        int[] arr3 = {1, 1, 1};
        MyCustomSequence mcs3 = new MyCustomSequence(arr3, 0, 1); // 길이가 3인 1번의 2번 하는 중.
        System.out.println(mcs3.getNthOrderData(25));
    }
}
