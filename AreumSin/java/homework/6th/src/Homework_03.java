public class Homework_03 {
    public static void main(String[] args) {
        //   100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 배열에 100명을 넣고 랜덤으로 5개에 값을 넣고 그 값이 나오면 당첨이라고 한다.

        final int TOTAL = 100;
        final int PICK = 5;

        int[] lottobox = new int[TOTAL];
        int[] pickNum = new int[PICK];

        // 랜덤으로 뽑은 값을 pickNum 배열에 넣어준다.
        // lottobox 배열 방 번호와 pickNUM가 일치하면 당첨된것이다.
        // 꼭 배열을 두개 써야하는 이유는 뭘까요...?
        // -> 중복 체크하기 위해서

        int cnt = 0,rand = 0;

        boolean isCheck = true;
        for(int i = 0; i < PICK; i++){
            while(isCheck) {
                rand = (int) (Math.random() * TOTAL);

                isCheck = false; // -> 잠시 멈추고 중복검사 후 true로 변경해서 다시 랜덤값 출력.

                // 중복체크해야함. 똑같은 번호가 랜덤이 있을 경우 다시 하도록.
                for (int j = 0; j < PICK; j++) {
                    if (pickNum[j] == rand) { // 중복일 경우를 가정.
                        // 랜덤을 다시 돌려야함.
                        isCheck = true;
                    }
                    /*
                    else{ // 중복이 아님.
                        pickNum[i] = rand;
                        isCheck = true; while을 못벗어남.
                    } */
                }// 중복체크

            } // while(isCheck)

            lottobox[rand] = 7777;
            pickNum[cnt++] = rand; //이거는 왜 하는걸까요...?

            System.out.println("lottoBox[" + rand + "] = " + lottobox[rand]);
            isCheck = true;


            System.out.println(i+" "+pickNum[i]);
        }// 당첨 숫자 5개 뽑음.
    }
}
