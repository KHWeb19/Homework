public class Multiple {
    final int START = 1;
    final int END = 100;
    final int REMAIN = 0;

    public void initMultiple(int decision) {
       for (int i=START; i<END; i++) {
           if (i%decision==REMAIN) {
               System.out.println(i);
           }
       }
    }
    public void sumMultiple(int decision) {
        int sum = 0;
        for (int i=START; i<END; i++) {
            if (i%decision==REMAIN) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
