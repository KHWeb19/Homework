public class Homework_10 {
    public static void main(String[] args) {
        //10. 2개의 배열을 만든다.
        //     하나는 과일을 담는 장바구니 배열
        //     하나는 해당 과일의 개수가 들어있는 배열이다.
        //     사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
        //     적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

        // 두개의 배열로 과일별로 갯수가 지정되었는걸 연결하는 법을 모르겠다...
        // 이중 배열을 사용해야하나..
        // 이중 for문 이용인가?

        // 배열에 가격을 지정해두고....? 갯수별로 곱하기를 해야하나..?

        // 하나는 과일을 담는 장바구니 배열이니깐 아직 아무것도 안들어가 있는걸 말하는건가..?
        // 값을 지정해 놓고 scanner을 이용해서 과일 종류와 갯수를 정하는걸까?

        String[] fruitName = {"사과", "귤", "오렌지", "수박", "멜론", "포도"};
        int[] fruit = new int[6];
        int[] fruitNum = {5, 3, 5, 2, 3, 4};

        //  0   1   2    3   4   5  -> i
        //  []  []  []   []  []  []
        // 사과  귤 오렌지 수박 메론 포도
        //  5    3   5    2   3   4
        //  0    1   2    3   4   5

        // int result += fruit[i] * fruitNum[j];

        // 이렇게 하면 가격은 어떻게 하지..? 가격 지정을.... .....ㅜㅠㅜㅠㅠㅜ
        // 랜덤으로 가격을 지정하고 1000 ~ 10000원 사이로 받고 fruitNum이랑 곱해버리면..  될까..?
        // 문제를 제대로 이해한게 맞을까..?

        final int MAX = 10000;
        final int MIN = 1000;
        final int RANGE = MAX - MIN +1;

        int result = 0;
        int rand;

        for(int i = 0; i <6; i++ ){
            rand = (int)(Math.random() * RANGE +MIN);
            System.out.printf("%s의 가격은 %d원 입니다.\n",fruitName[i],rand);
            fruit[i] = rand;

            fruit[i] *= fruitNum[i];
            System.out.printf("%s의 전체 가격은 %d원 입니다.\n\n",fruitName[i],fruit[i]);

            result += fruit[i] * fruitNum[i];
        }

        System.out.printf("결제할 금액은 %d 입니다.",result);

        

    }
}
