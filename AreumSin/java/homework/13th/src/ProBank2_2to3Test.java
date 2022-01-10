public class ProBank2_2to3Test {

    //2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
    //3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...

    /*
        2번
        [0] + [1] = [2]
        [1] + [2] = [3]

        3번 -1 // 순서대로 값이 나오지 않음. 보정치가 필요함.
        [0] + [1] + [2] = [4]
        [1] + [2] + [3] = [5]

        3번 -2 // 순서를 뛰어넘어야함. 점핑이 필요함.
        [0] + [2] = [3]
        [1] + [3] = [4]
     */

    // 매개변수로 들어갈 것
    // 초기 배열, 보정치, 점핑

    public static void main(String[] args) {
        System.out.println("2번 문제");
        int[] arr = {1, 1};
        MyCustomSequence mcs = new MyCustomSequence(arr, 0);
        System.out.println(mcs.getNthOrderData(25));

        System.out.println("3번 문제");
        int[] arr2 = {1, 1, 1, 2};
        MyCustomSequence mcs2 = new MyCustomSequence(arr2, 1);
        System.out.println(mcs2.getNthOrderData(20));

        int[] arr3 = {1,1,1};
        System.out.println("3번 문제 -2");
        MyCustomSequence mcs3 = new MyCustomSequence(arr3, 0, 1);
        System.out.println(mcs3.getNthOrderData(20));
    }

}
