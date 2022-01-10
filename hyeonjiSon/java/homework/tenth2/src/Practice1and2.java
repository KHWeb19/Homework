public class Practice1and2 {
    public static void main(String[] args) {
        //문제1. 2 by 2 이중 배열을 초기화해서 아무 값이나 넣어보세요.
    /* 복습 포인트
    1. 문제 푸는 법은 맞췄으나 for문을 main이 아닌 데이터 타입에 넣어 더 깔끔하게 만들어야 함
    2. 지금 단계에서는 3by3까지 나오게 하는 방법까진 구현하려고 하지 말자!
     */
        ArrayTest arrayTest = new ArrayTest();

        arrayTest.initArr();
        arrayTest.printArr();

    }
}
