public class Student {
    final int MAX = 100;
    final int MIN = 50;
    final int NUM = 30;

    int studentNum;
    int ranges;
    int sum1,sum2,sum3;


    public int rollStudent1() {
        ranges = MAX - MIN + 1;
        return (int) (Math.random() * ranges + MIN);
    }

    public int rollStudent2() {
        ranges = MAX - MIN + 1;
        return (int) (Math.random() * ranges + MIN);
    }

    public int rollStudent3() {
        ranges = MAX - MIN + 1;
        return (int) (Math.random() * ranges + MIN);
    }


    public void StudentNum() {
        for (int i = 1; i <= NUM; i++) {

            System.out.printf("학생[%d] = %d,%d,%d\n", i, rollStudent1(), rollStudent2(), rollStudent3());
            sum1 += rollStudent1();
            sum2 += rollStudent2();
            sum3 += rollStudent3();

        }
        System.out.printf("총합 %d,%d,%d\n",sum1,sum2,sum3);
        System.out.printf("총평균 %d,%d,%d\n",sum1/NUM,sum2/NUM,sum3/NUM);
    }
}