public class ProBank6_1Test {
    public static void main(String[] args) {
        // for문 내부에서 가로길이 2를 0.001로 나눠서 몇 개 나오는지 판별
        // 2를 0.001로 나누면 2000개인데 이걸 어떻게 구할까
        // run() 매서드에 for문을 넣으면 될까..?
        // for문에 어떻게 몇 개가 나오는지 구하는 식을 넣을까..
        // 어쨋든 for문에서 나오는 값들로 높이2를 구하는 식을 작성하는건 할 수 있겠는데..
        // 각각의 작은 면적값들을 합산해서 4에 근접하는지 확인하는건
        // 어떻게 구현하나....

        Thread t = new Thread(new SquareArea(2,0.001f));
    }
}
