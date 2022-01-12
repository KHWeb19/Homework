public class RandomMoving {
    //   10. 1 ~ 100까지의 숫자를 순회한다.
    //   9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
    //  다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
    //  이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

    //생성자 생성해서 값을 입력받아서 할수있도록 해봐야할듯듯

   final int RANGE_MAX = 10;
    final int RANGE_MIN = 2;

    final int START = 1;
    final int END = 100;

    int range = RANGE_MAX - RANGE_MIN + 1;
    int sum = 0 , i;

    public void ranNumSum(){
        for(i = START; i < END; i++){
                int ranNum = (int)(Math.random() * range + 1);
               if(i + ranNum <100){
                   System.out.println(ranNum + " " + i);
                i += ranNum;
               }



        }
        System.out.println(i);
    }

}
