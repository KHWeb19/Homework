public class Homework10 {
    public static void main(String[] args) {
//    사과 5, 귤 3, 오렌지 5, 수박 2, 메론 3, 포도 4개를 배열로 표현하고
//    적당한 값을 매겨서 합산 가격을 출력하도록 프로그래밍 하시오.

//        HOW TO..
//        1. 과일, 개수, 가격 배열 만들기
//        2. 배열 값 가져와서 가격 구하기

        int sum = 0;
        String[] fruit = {"사과", "귤", "오렌지", "수박", "메론", "포도"};
        int[] fruitNum = {5,3,5,2,3,4};
        int[] price = {2000, 500, 1500, 12000, 9000, 8000};

        for (int i = 0; i < fruit.length; i++){
            System.out.printf("%s %d개 : %d원\n", fruit[i], fruitNum[i], fruitNum[i] * price[i]);
            sum += fruitNum[i] * price[i];
        }
        System.out.printf("\n합산 가격 : %d원", sum);
    }
}
