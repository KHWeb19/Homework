public class hw10 {
    public static void main(String[] args) {

       final int MAX = 6;
       final int MID = 3;
       final int MIN = 0;
       final int PRICE1 = 1000;
       final int PRICE2 = 2000;


        String [] fruit = new String [] {"사과", "귤", "오렌지", "수박", "메론", "포도"};
        int [] count = new int[] {5, 3, 5, 2, 3, 4};


        for (int i=MIN;i<MID; i++){
            int res = count[i]*PRICE1;
            System.out.println(fruit[i] +"의 가격 : "+ res);
        }
        for (int i=MID;i<MAX; i++){
            int res = count[i]*PRICE2;
            System.out.println(fruit[i] +"의 가격 : "+ res);
        }


}}
