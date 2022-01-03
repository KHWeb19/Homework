public class Q9 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int i = (int) (Math.random() * 9 + 2);
        int i2 = (int) (Math.random() * 9 + 2);
        int i3 = (int) (Math.random() * 9 + 2);
            for (int i4 = 1; i4 < 101; i4++) {
                if (i4 % i == 0) {
                    sum1+=i4;
                    System.out.println(i4);
                }
            }
        System.out.println("합계:"+sum1);
        for (int i5 = 1; i5 < 101; i5++) {
            if (i5 % i2 == 0) {
                sum2+=i5;
                System.out.println(i5);
            }
        }System.out.println("합계:"+sum2);
        for (int i6 = 1; i6 < 101; i6++) {
            if (i6 % i3 == 0) {
                sum3+=i6;
                System.out.println(i6);
            }
    }
        System.out.println("합계:"+sum3);
        System.out.println("합계: "+(sum1+sum2+sum3));
    }

}

