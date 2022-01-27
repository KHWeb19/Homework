public class JavaStrcmp implements Comparable{
    private double doubleNum = 0;

    public JavaStrcmp(double doubleNum){
        this.doubleNum = doubleNum;
    }

    @Override
    public int compareTo(Object otherObject) {
        JavaStrcmp other = (JavaStrcmp) otherObject;

        if(this.doubleNum < other.doubleNum){
            return -1;
        }else if( this.doubleNum > other.doubleNum){
            return 1;
        }else  {
            return 0;
        }
    }
}
