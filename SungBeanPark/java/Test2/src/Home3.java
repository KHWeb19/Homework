public class Home3 {
    public static void main(String[] args) {
        //1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //n번째항 + n+2번째항  = n+3번째항이라는 규칙
        //n+1번째항 변수를 만들고
        //first(n번째) <- second(n+1번째) <- third(n+2번쨰)로 변수를 옮겨준다

        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;
        final int START = 3;
        final int END = 20;

        for(i = START; i < END; i++){
            result = first + third;
            System.out.printf("%d번째의 항은 : %d\n", i+1, result);
            first = second;
            second = third;
            third = result;
        }
    }
}
