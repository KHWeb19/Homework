public class JavaQuiz11 {
    public static void main(String[] args) {
        int rand1 = (int)(Math.random()*58+65);
        if (rand1>=65){
            if (rand1<=90){
                System.out.println("65~90사이의 수 출력 " +rand1);
            }else if (rand1>=97){
                System.out.println("97~122사이의 수 출력 " +rand1);
            }else {
                System.out.println("해당사항 없음");
            }
        }
    }
}
