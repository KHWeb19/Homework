public class JavaStrcmp implements Comparable{
    private double doubleNum = 0;

    public JavaStrcmp(double doubleNum){
        this.doubleNum = doubleNum;
    }

    @Override
    public int compareTo(Object otherObject) {
        JavaStrcmp other = (JavaStrcmp) otherObject;

        if(this.doubleNum < other.doubleNum){
            System.out.println("입력이 더 크다");
            return -1;
        } else if (this.doubleNum > other.doubleNum){
            System.out.println("입력이 더 작다");
            return 1;
        } else{
            System.out.println("두 개는 같다");
            return 0;
        }
    }
}
