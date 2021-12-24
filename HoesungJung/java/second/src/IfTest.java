public class IfTest {
    public static void main(String[] args) {
        int rand = (int)(Math.random()*10+3);
//==는 '같은가?'라는 질문형 연산자
        if(rand%2==0) {
            System.out.println("나는 짝수: " + rand);//true
        } else{
            System.out.println("나는 홀수: "+rand);//false
        }
    }
}
