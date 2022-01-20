public class HW9 {
    public static void main(String[] args) {

        //문제 이해를 잘 못해서 루프를 3번하고 그 합을 구함
        int ran1 = (int) ((Math.random()) * 8) + 2;
        int ran2 = (int) ((Math.random()) * 8) + 2;
        int ran3 = (int) ((Math.random()) * 8) + 2;
        // int range = max - min + 1;
        int sum= 0 ;

        for (int i = 1; i <= 100; i++) {
            if (i % ran1 == 0) {
                System.out.println(i);
                sum+=i;}
        }

        for (int j = 1; j <= 100; j++) {
            if (j % ran2== 0) {
                System.out.println(j);
                sum+=j;}
        }

        for (int z = 1; z <= 100; z++) {
            if (z % ran3 == 0) {
                System.out.println(z);sum+=z;}
        }

        System.out.println(sum);
        }
}




