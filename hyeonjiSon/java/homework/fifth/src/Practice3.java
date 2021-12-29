import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        //   100명 중 5명이 당첨되도록 만들어보자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        //2. 매 항마다 숫자가 +1씩 커지는 배열을 만들어준다.
        final int START = 1;
        int[] arr;

        //1. import Scanner를 사용해 사용자가 1~100중 원하는 숫자를 입력할 수 있도록 한다.
        Scanner scan = new Scanner(System.in);

        System.out.print("1~100 중 숫자 1개를 골라보세요! : ");
        int end = scan.nextInt();
        arr = new int[end];

        boolean defense = false;
        arr[0] = 1;

        //3. for문을 이용해 arr[99](100번)번째 배열이 나올때 까지 반복되는 반복문을 만들어준다.
        for(int i = START; i < end; i++){
            arr[i] = i + 1;

            //3-1. 조건문 if를 사용해 11, 33, 55, 77, 99 (5개)의 숫자를 사용자가 입력한 경우,
            //      = 당첨되었습니다. 라는 문구가 출력되도록 한다.
            if(i == 10 || i == 32 || i == 54 || i == 76 || i ==98){
                System.out.printf("arr[%d] = 당첨입니다!\n", arr[i]);
                defense = false;
            } else {
                //3-2. 그 외의 숫자는 else를 사용해  = 꽝! 이라는 문구가 출력되도록 한다.
                System.out.printf("arr[%d] = 꽝!\n", arr[i]);
                defense = false;
        }

        }

    }
}

//문제점. 키보드로 입력한 숫자에 도달할 때 까지 결과가 모두 출력됨. ㅋㅋ...
//배열보다 boolean이나 깔끔하게 배열이 전부 나오지 않는 반복문(조건문)만 사용하는게 좋을 것 처럼 보이니 제대로 만든건지 모르겠음.
//end값 만큼만 돌아가게 만드는 게 아니라 반복문 100까지 돌아가게 한 다음 Scanner에 숫자를 입력하면 답이 맞는지 아닌지 결과만 출력하게 만들어야 하는건가?
//Practice3_1에 이 버전을 다시 만들어보자...