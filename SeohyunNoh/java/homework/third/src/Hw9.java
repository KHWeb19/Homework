public class Hw9 {
    public static void main(String[] args) {
        // 2~10사이의 랜덤한 숫자 뽑기
        int min = 2;
        int max = 10;
        int range = (max - min)+ 1;
       // 여기서부터 전체를 루프로 감쌌으면 될 것 (12.24 feedback)
        int rand = (int)(Math.random() * range + min);

        //sum값 지정
        int sum = 0;

        //1~100까지 숫자 순회
        for(int i=1 ; i<=100 ; i++){
            if(i % rand == 0){
                System.out.println(rand + "의 배수 : " + i);
                sum += i;
            }
        }
        System.out.println("출력된 숫자들의 합은 : " + sum);

    }
}
