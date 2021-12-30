public class ArrayTest {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] arr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}

// Q. 배열은 왜 쓰나요 ?
// A. 동일한 데이터 타입이 너무 많아서 편하게 관리하고자 하기 위함
//    성적표
//    int aScore, bScore, cScore, ... zScore, zaScore, .. zzScore .. zzzScore
//    int[] score;
//    for ( ~~~ ) score[] ~~~