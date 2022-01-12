public class WhileTest3 {
    public static void main(String[] args) {
        int i = 0;
        while (i<30) {
            i++;
            if (i%5==0) {
                System.out.println("while문과 if문으로 1부터 30까지 중 5의 배수 출력: " + i);
            }
        }
    }
}
