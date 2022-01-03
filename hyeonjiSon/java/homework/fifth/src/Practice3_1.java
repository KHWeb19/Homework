import java.util.Scanner;

public class Practice3_1 {
    public static void main(String[] args) {
        //배열로 로또 문제를 만들어보기!
        //   100명 중 5명이 당첨되도록 만들어보자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        //1. 매 항마다 숫자가 +1씩 커지는 배열을 만들어준다.
        final int START = 1;
        final int MAX = 100;
        int[] arr = new int [MAX];

        int answer = 0;

        //2. for문을 이용해 arr[99](100번)번째 배열이 나올때 까지 반복되는 반복문을 만들어준다.
        for(int i = START; i < MAX; i++) {
            arr[i] = i + 1;

            answer = arr[i]; //2_1. 루프마다 arr[i] 값의 int answer를 남겨줌
        }

        //3. import Scanner를 사용해 사용자가 1~100중 원하는 숫자를 입력할 수 있도록 한다.
        Scanner scan = new Scanner(System.in);

        System.out.print("1~100 중 숫자 1개를 골라보세요! : ");
        int choice = scan.nextInt();

        arr[0] = 1;

        //3. int answer의 값이 11, 33, 55, 77, 88 이라면 당첨 / 아니라면 꽝 이 출력되도록 한다.
        if(choice == 11 || choice == 33 || choice == 55 || choice == 77 || choice ==99){
            System.out.printf("arr[%d] = 당첨입니다!\n", choice);

        } else {
            //3-2. 그 외의 숫자는 else를 사용해  = 꽝! 이라는 문구가 출력되도록 한다.
            System.out.printf("arr[%d] = 꽝!\n", choice);
        }

        }

    }

// ...이건 만들어놓고 나니까 위의 배열이 있든 없든 상관이 없는 구조인 것 처럼 보인다...
// 랜덤 어레이 인덱스를 참고해야하나? 랜덤으로 arr[정수] = true or false 정해지도록 해서
// arr[정수] = true 의 값을 입력하면 당첨! 아니면 꽝! 이 나오게 해야하는건가? 배열에 boolean은 어떻게 쓰지?
// 아 이상하다... 선생님...거저먹는 문제라고 하셨는데...오늘 숙제 쉽다고 하셨는데...먹을 수가 없어요...