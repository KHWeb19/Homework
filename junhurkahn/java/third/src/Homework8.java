public class Homework8 {
    public static void main(String[] args) {
        //1~100까지 숫자를 순회한다.
        //2~10사이의 랜덤숫자를 선택하고 이 숫자의 배수를 출력해보도록한다.
        for(int i = 1; i < 101; i++ ) {
            System.out.printf("1~100 숫자 %d\n",i);
            int j = (int)(Math.random() * 8 + 2);
            System.out.printf("2~10 랜덤숫자 : %d\n",j);
            System.out.printf("결과 %d \n",i*j);

        }
    }
}
