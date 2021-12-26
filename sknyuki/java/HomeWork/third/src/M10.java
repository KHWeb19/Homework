public class M10 {
    public static void main(String[] args) {
        //2~10사이의 랜덤 숫자를 추출해내고 0~100까지의 랜덤 숫자를 n번 추가적으로 추출후 더해갔을때 최종 값
        int random1 = (int) (Math.random() * 9 + 2);
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {
            sum += random1;
            sum2 += sum;
            System.out.printf("100까지 2~10의 랜덤 값 %d번 만큼 합산한 값은%d이며, 이들의 총합은 %d이다\n.",i,sum,sum2);

        }
    }
}
