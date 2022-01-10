
public class PeopleRan {


        LottoIdx lotto = new LottoIdx();


        int[] people = new int[lotto.TOTAL];
        //중복방지를 위해 새로운 배열을 생성함
        int[] avoidDuplication = new int[lotto.TOTAL];

       //처음엔 새로 똑같이 isRealloc 과 allCnt를 생성하고 초기화시켜서 중복방지를 만들려고 했으나
       //크게보면 이것도 똑같은 것을 중복해서 사용하는 느낌이라 다시 활용함
        //int allCnt = 0;
        //boolean isRealloc = true;

        public void initRandom() {
            //100명의 사람들에게 각자 번호가 쥐어짐
            //왜 당첨번호를 boolean타입을 사용했을까??
            //로또 번호랑 사람이 들고있는 번호가 같으면 당첨
            //생각해보니 여기서도 번호가 중복되면 안됨

            lotto.initLottoIdx();
            //처음엔 새로 똑같이 isRealloc 과 allCnt를
            //위에 메소드를 실행하면 allCnt는 결국 최종값인 4인가? 싶어 일단 0으로 초기화 시켜줌
            //반대로 isRealloc은 최종적으로true인거 같아서 다시 그대로 활용함

            lotto.allCnt = 0;

            for (int i = 0; i < lotto.TOTAL; i++) {
                while (lotto.isRealloc) {
                    people[i] = (int) (Math.random() * lotto.TOTAL);
                    lotto.isRealloc = false;

                    for(int j = 0; j < lotto.allCnt; j++){
                        if(people[i] == avoidDuplication[j]){
                            lotto.isRealloc = true;
                            break;
                        }
                    }
                }
                avoidDuplication[lotto.allCnt++] = people[i];
                    lotto.isRealloc = true;
            }

        }
}
