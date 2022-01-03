import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        //변수를 정의한다.
        //사용자의 입력을 받기위해 Scanner를 사용한다.
        //for문을 사용하여 원하는 항의 값을 출력한다.
        final int START = 1;
        //상수값을 지정하여 for문이 1부터 돌게한다.
        int[] arr;
        //배열 타입과 이름을 지정한다.
        Scanner scan = new Scanner(System.in);
        //사용자의 값을 입력 받기 위한 클래스? 를 사용한다.
        System.out.print("수열의 몇 번째 항을 구할까요?");
        // 사용자에게 묻는 질문 print문을 사용.
        int end = scan.nextInt();
        //사용자의 값을 받는 구문?
        arr = new int [end];
        //arr에 사용자로부터 받은 값을 대입한다.
        arr[0] = 1;
        //첫번째 배열은 1로 지정한다 왜?

        for( int i = START; i < end; i++){
            arr[i] = arr[ i - 1] + arr[i - 1];
            //우연히 1을 집어 넣었더니 수열은 나오는거 같으나 이해가 되지 않습니다.
            System.out.printf("arr[%d] = %d\n", i , arr[i]);
           //원하는 위치의 값을 뽑아내려 했으나 이전 항들도 나열이 되서 결과가 출력됩니다.
        }


    }

}
