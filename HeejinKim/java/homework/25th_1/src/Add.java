

public class Add {

    //등비 수열 2^0 2^1 2^2 사용자 입력을 통하여 원하는 값 //big 을 안쓰면 31항 까지 가능함
    //[0]---1번째 항 [1]--2번째 항 [2]---3번째항

    int base;
    int count;
    int num;

    public Add(final int BASE , int count){

        this.base=BASE;
        this.count=count;
    }


    public int getTotalNum(int count){

        num=(int)Math.pow(base,(count-1));

        return num;

    }

}
