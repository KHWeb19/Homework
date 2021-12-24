public class Hw8 {
    public static void main(String[] args) {
        // 2~10사이의 랜덤한 숫자 뽑기
        int min = 2;
        int max = 10;
        int range = (max - min)+ 1;
        int rand = (int)(Math.random() * range + min);

        //1~100까지 숫자 순회
        for(int i=1 ; i<=100 ; i++){
            if(i % rand == 0){
                // 출력하면 가로로 rand의 배수 : ~~~ 가 나오는게 아니라
                // 세로로 배수들이 출력된다. 어떻게 가로로하는지 모르겠음
                System.out.println(rand + "의 배수 : " + i);
            }
        }

    }
}
