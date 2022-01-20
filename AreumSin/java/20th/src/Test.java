public class Test {
    int num1;
    int num2;
    static int cnt = 0; // 전역변수 // 전역변수라서 값이 올라간다.

    public Test(){
        // 그래서 cnt++이 일어난다.
        num1 = 3 + cnt;
        num2 = 7 + cnt++;
    }

    @Override
    public String toString() {
        return "Test{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
