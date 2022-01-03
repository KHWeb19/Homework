public class Homework8 {
    public static void main(String[] args) {
     /* 두명이 주사위 게임을 해야하니 배열을 사용
     각자 2개씩 사용할수 있으니 배열 사용
     주사위 숫자는 Math.random 사용
     처음 주사의 를 굴렸을때 결과가 짝수라면 한번더니깐 break문 사용
     특수 주사위 배열 사용*/

        int player = 3;
        int[] arr = new int[player];
        for (int i = 1; i < player; i++) {
            int num = (int) (Math.random() * 6) + 1; //주사회 번호 하나 뽑기
            //다시돌리기 위해 return 넣어줬는데 첫번쨰는 괜찮은데 두번째 짝수가 나왔을때 소용이 없음
            if (num == 1) {
                System.out.println("1번이 나왔습니다.");
            } else if (num == 2) {
                System.out.println("2번이 나왔습니다. 한번더돌릴수있습니다");
                return;
            } else if (num == 3) {
                System.out.println("3번이 나왔습니다.");
            } else if (num == 4) {
                System.out.println("4번이 나왔습니다.한번더돌릴수있습니다");
                return;
            } else if (num == 5) {
                System.out.println("5번이 나왔습니다.");
            } else {
                System.out.println("6번이 나왔습니다.한번더돌릴수있습니다");
                return;
            }
        }
    }
}



