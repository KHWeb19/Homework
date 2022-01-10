public class InitialSet {
    //피보나치 수열의 20번째 항을 구하도록
    int[] initArr;
    int length;
    int bias;
    int jumping;

    int[] seqArr;//사용하는 배열

    public InitialSet(final int[] arr, int bias) {
        length = arr.length;//배열의 길이를 생성

        this.initArr = arr.clone();
        this.bias = bias;

        jumping=0;//jumping을 사용하지 않는 부분은 0로 셋팅
    }


    public InitialSet(final int[] arr, int bias, int jumping) {
        //점핑에서는 바이어스 안쓰는데 빼야되는거 아닌가요?----오버로딩할 때 (int,int형)이라 문제가 생김
        length = arr.length;//배열의 길이를 생성 //4로 나옴

        this.initArr = arr.clone(); //초기 배열은 배열을 복사함
        this.bias = bias;
        this.jumping = jumping;

    }

    public void initArr() {//백업해놓은것을 옮겨야함
        for (int i = 0; i < length; i++) {
            seqArr[i] = initArr[i]; //초항을 seqArr에 넣음
        }
    }

    public int getNthOrderData(int count) {  //count를 요청하는데 까지의 배열을 만든다

        seqArr = new int[count];                //배열 20개를 만든다

        initArr();//초항을 넣은 배열

    /* 현재 구조의 문제점 2개 처리에는 적합하지만 3개, 4개, 5개, n개 처리는 불가능한 구조
        for (int i = length; i < count; i++) {
            seqArr[i] = seqArr[i - 1] + seqArr[i - 2];
        } */

        int tmp;//임시저장소에 저장을 해둠 for문을

        for (int i = length; i < count; i++) {//시작점
            tmp = 0;//으로 만들면 누산하기가 편해짐 이 값을 배열에 계속 업데이트 해야되는 문제가 발생

            for (int j = length; j > bias; j--) {
                tmp += seqArr[i - j];

                j-=jumping;//seqArr[i - j]의 값 계속 누산하면 되는데 seqArr배열에 계속 없데이트 해야됨
                //이 루프가 끝났을 때는  seqArr[i] 가 계산이 된 상태
                // 4 - 4, 4 - 3, 4 - 2 ===> 0, 1, 2
                // 5 - 4, 5 - 3, 5 - 2 ===> 1, 2, 3
                //j는 이전 항들의 합을 구하기 위해서 사용됨.
                //tmp에 [1] [1] [1]
                //       0   1   2 배열의 합을 저장해두고 j가 1이 되었을 때 빠져나와서
                //seqArr[i] = tmp;  에 저장되어 이 다음의 수를 구할수가 있음음
            }
            seqArr[i] = tmp;     //seqArr[i] = seqArr[i - 1] + seqArr[i - 2]; 동일한 역할을 함
                                    // n개 모든 상황을 처리할수 있는 구조로 바뀌게 됨
            System.out.printf("seqArr[%d]=%d\n", i, seqArr[i]); //잘 되는지 볼 수 있음
            }
            return seqArr[count - 1];

        }
    }


