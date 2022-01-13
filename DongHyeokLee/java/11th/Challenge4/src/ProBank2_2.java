public class ProBank2_2 {
    public static void main(String[] args) {

    //2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    //일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
    // 3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
    //이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자

    //이걸 같이 풀 수 있다고 한다
    //first second third
    //first second third 5th

    FibonacciSequence fibo = new FibonacciSequence(2,20);

    fibo.sequenceGenerate();
    System.out.println(fibo);

    GeometricSequence geo = new GeometricSequence(4,25);
    geo.sequenceGenerate();
    System.out.println(geo);

    }
}
