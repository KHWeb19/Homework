public class WhileTest3 {
    public static void main(String[] args) {
        int i = 0;

        //while 조건식 내부에서 전위, 후위 연산자를 쓰는 것이 혼동된다면
        //아래와 같이 그냥 내부에서 ++해도 상관없음.
        //차후 익숙해지면 코드를 줄이기 위해 조건식에 넣을 수 있게 될 것임.
        while (i < 10){
            i++;
            System.out.println("i = " + i);
        }
    }
}
