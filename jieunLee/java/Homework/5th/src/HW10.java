public class HW10 {
    public static void main(String[] args) {
        final int LENGTH = 6;
        String[] fruit = new String[LENGTH];
        int[] num = new int[LENGTH];
        int[] price = new int[LENGTH];

        fruit[0]="사과";
        fruit[1]="귤";
        fruit[2]="오렌지";
        fruit[3]="수박";
        fruit[4]="메론";
        fruit[5]="포도";

        num[0]=5;
        num[1]=3;
        num[2]=5;
        num[3]=2;
        num[4]=3;
        num[5]=4;

        price[0]=1000;
        price[1]=500;
        price[2]=800;
        price[3]=9000;
        price[4]=6000;
        price[5]=8000;

        for (int i=0; i<LENGTH; i++) {
            System.out.printf("%s %d원\n", fruit[i], num[i]*price[i]);
        }

    }
}
