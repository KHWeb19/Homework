public class HW10 {
    public static void main(String[] args) {
        // 2개 배열 생성
        // String[] fruit 사과 귤 오렌지 수박 메론 포도
        // int[] quantity 5 3 5 2 3 4
        // int[] price 1000 5000 3000 800 500 10

        final int SIZE = 6;

        String[] fruit = new String[SIZE];
        int[] quantity = new int[SIZE];

        fruit[0]= "사과";
        fruit[1] = "귤";
        fruit[2] = "오렌지";
        fruit[3] = "수박";
        fruit[4] = "메론";
        fruit[5] = "포도";

        quantity[0] = 5;
        quantity[1] = 3;
        quantity[2] = 5;
        quantity[3] = 2;
        quantity[4] = 3;
        quantity[5] = 4;

        int[] price = new int[SIZE];

        price[0] = 1000;
        price[1] = 5000;
        price[2] = 3000;
        price[3] = 800;
        price[4] = 500;
        price[5] = 10;

        for (int i = 0; i<SIZE; i++){
            System.out.printf("%s %d개 개당 %d원 총합 %d원\n", fruit[i], quantity[i], price[i], quantity[i]*price[i]);
        }

    }
}
