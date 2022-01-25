public class Test {
    int num1;
    int num2;
    // static이기 때문에 전역적으로 cnt값이 늘어나는 것이 가능
    static int cnt = 0;

    public Test(){
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
