public class HW09 {
    //  1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
    //  이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
    //  배열화 해서 풀기

    public static void main(String[] args) {
        final int SIZE = 25;

        int[] sequence = new int[SIZE];

        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 1;

        for (int i =3; i<SIZE; i++){
            sequence[i] = sequence[i-3] + sequence[i-1];
        }

        for (int i=0; i<SIZE; i++){
            System.out.printf("%d ", sequence[i]);
        }

    }
}
