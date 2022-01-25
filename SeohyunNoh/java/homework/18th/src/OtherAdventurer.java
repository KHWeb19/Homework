public class OtherAdventurer {
    // public
    // private
    // protected : "가"문의 가보 --> 즉, 같은 가문에 소속된 사람들끼리는 protected의 정보 공유 가능
    protected int str;
    protected int con;

    final int START_VALUE = 10;

    public OtherAdventurer(){
        str = START_VALUE;
        con = START_VALUE;
    }

    @Override
    public String toString() {
        return "Adventurer{" +
                "str=" + str +
                ", con=" + con +
                ", START_VALUE=" + START_VALUE +
                '}';
    }
}
