public class M6 {
    public static void main(String[] args) {


        // 45678911234를 string으로 변환(각 숫자들을 "문자"로서 인식시키기위해)
        //변환 시킨 각 숫자 하나씩를 배열에 대입시킨다.
        //
        //for문을 돌려서 arr[i]=로 루프를 돌린다?

        final int NUMLENGHT = 11;


        final CharSequence STRNUM = "45678911234";
        int[] array = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        String[] arr = new String[NUMLENGHT];
        for (int i = 0; i < STRNUM.length(); i++) {
            arr[i] = String.valueOf(STRNUM.charAt(i)); // 또는, arr[i] = str.charAt(i) + "";
        }
        for (int i = 0; i < NUMLENGHT; i++) {

            System.out.printf("%sx10^%d\n", arr[i], array[i]);
        }
    }
}
