import java.util.ArrayList;

public class ArrayListClassExample {
    public static void main(String[] args) {
        final int ACCOUNT_NUM = 3;

        ArrayList<OtherAdventurer> advList = new ArrayList<>();

        OtherAdventurer[] advArr = new OtherAdventurer[ACCOUNT_NUM];

        for (int i = 0 ; i < ACCOUNT_NUM ; i++){
            advArr[i] = new OtherAdventurer();
            advList.add(advArr[i]);
        }

        for(int i = 0 ; i < ACCOUNT_NUM ; i++){
            System.out.println("계정 정보를 유출합니다");

            System.out.println(advList.get(i));
        }
    }
}
