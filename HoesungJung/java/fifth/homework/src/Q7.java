public class Q7 {
    public static void main(String[] args) {
        //회사 직원 7명, 모두 초봉 3500 부럽...
        final int ARRMAX = 7;
        final int START = 35000000;
        final int MAX = (int)(START+(START+0.1));

        //각자 인상률 연1~10%
        //이들이 5년 후에 받게될 연봉은..?

        final int RAISE = (int)(START+(START*0.1));
        final int MIN = (int)(START+(START*0.01));

        //배열 7만큼 할당
        int [] arr = new int[ARRMAX];

        //초봉으로 시작해서.... 어....... 음.......?????????
        for(int i = START; i>MIN; i++){
            arr[i] = i;
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }

    }
    //역시 모르겠습니다....
}
