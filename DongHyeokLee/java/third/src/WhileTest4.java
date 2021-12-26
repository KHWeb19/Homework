public class WhileTest4 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 31) {
            i++;

            //1~30까지 숫자 중에서 5의 배수를 출력하세요 와 같은 역할

            if(i % 5 == 0){
                System.out.printf("i는 5의 배수 = %d\n ", i);
            }
        }
    }
}
