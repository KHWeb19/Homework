import java.util.Scanner;

public class Ans10 {
    public static void main(String[] args) {


        // 사실 지금은 각 인덱스를 지정해서 값을 부여했다만
        // 실제 사용자는 랜덤하게 물품을 고르게됨
        // 그리고 매장에서 관리하는 물품은 시장 상황에 따라 추가될 수도 줄어들 수도 있음
        // 그러므로 지금처럼 IDX를 고정시킬 수 없기도함
        // 그렇기 때문에 실제로는 사용자가 선택했을때 그 값을 랜덤하게 셋팅하게 만들어줘야함
        // 근대 그러면 문제가 너무 어려워져서 좀 쉽게가져가게 하려고 했음
        // 그래서 인덱스 값을 고정했는데
        // 이 고정된 값 자체가 실제 사용자가 고른 품목이라고 생각하면 되겠음
        // 또한 고른 품목의 가격은 얼마인지 알 수 있으니 그 가격이 책정되었다고 보면 됨
        // 실제 위에서 사용자가 고른 정보가 배치되고
        // 이 물품을 몇 개 고른지 기록하는 상황임
        // 이 배열 두 개의 정보를 모두 가지고 있으면 영수증이 만들어짐
        // 파악해야할 사항이라면 지금 APPLE_IDX라고 적어놓은 사항이
        // 향후에는 랜덤하게 들어갈 수 있다는 것을 기억해야함
        // [0] = 3, [1] = 5, [2] = 10
        // 즉 3번 항목, 5번 항목, 10번 항목이 선택되었음을 의미

        // 사용자가 과일종류 선택했을떄 랜덤하게 셋팅
        // 갯수 사용자 선택
        // 가격은 = 고정
        //무엇을 배열로 만들까
        //크게 보면 재고도 필요하고 없으면 주문 안되게 하는 시스템도 필요하군

        Scanner sc = new Scanner(System.in);

        final int TOTAL = 6;

        final int APPLE= 1000;
        final int MANDARIN = 500;
        final int ORANGE = 2000;
        final int WATERMELON = 10000;
        final int MELON = 5000;
        final int GRAPE = 3000;

        boolean addOrder = true;
        int sum = 0;


        // 구매자가 처음 선택한 물품이 인덱스 0번에 들어가게 어케하노 자 애플 입력했다치자
        // 애플 입력하면 처음입력 할때 그게 인덱스 0번에 들어가고 apple 의 가격이 측정
        //근데 문제 의도데로 못푼거 같음. 느낌이 그럼
        int[] kindOfFruit = new int[TOTAL];
        int[] numOfFruit = new int[TOTAL];

        while(addOrder) {
            for (int i = 0; i < TOTAL; i++) {
                for(int j = 0; ; j++) {


                System.out.print("원하는 과일을 입력하시오 : ");
                String kind = sc.nextLine();
                //사과를 입력하면 그게 가격으로 변경되서 저장되면 멋지겠다..
                //인터넷에선 사과를 클릭하면 사과가 입력되고 뭐 그런건가

                    if (kind.equals("사과")) {
                        kindOfFruit[i] = APPLE;
                        break;
                    } else if (kind.equals("귤")) {
                        kindOfFruit[i] = MANDARIN;
                        break;
                    } else if (kind.equals("오렌지")) {
                        kindOfFruit[i] = ORANGE;
                        break;
                    } else if (kind.equals("수박")) {
                        kindOfFruit[i] = WATERMELON;
                        break;
                    } else if (kind.equals("메론")) {
                        kindOfFruit[i] = MELON;
                        break;
                    } else if (kind.equals("포도")) {
                        kindOfFruit[i] = GRAPE;
                        break;
                    } else {
                        System.out.println("다시 입력해주세요");
                        continue;//이거하면 i++되는듯 for문 하나 더 만들까
                    }
                }

                System.out.print("원하시는 수량을 입력해주세요 : ");
                int num = sc.nextInt();

                numOfFruit[i] = num;

                //다시 사과를 입력하면 우짬? Y를나 N을 입력안하면 다시 입력하라해야할듯??
                //다시 사과해도 합산가는 제대로나오는데 다음번은 인덱스 1번에 저장됌 이래도 돼나
                System.out.print("추가 주문을 하시겠습니까?(Y/N)");
                char select = sc.next().charAt(0);

                if (select == 'Y') {
                    continue;
                //지금까지주문한것들 품목과 수량 가격 나오게...은 포기
                    //그냥 합산가만..
                }else{
                    for(i = 0; i < TOTAL; i++)
                        sum += kindOfFruit[i] * numOfFruit[i];
                    System.out.println("전체 합산가 = " + sum);
                        addOrder=false;
                        break;
                }


            }

        }




    }
}
