public class Asc {
    public void initRand(int min, int max) {
        boolean isAsc = false;
        while (!isAsc) {
            int rand = (int)(Math.random()*(max-min+1)+min);
            if (65<=rand && rand<=90) {
                System.out.printf("랜덤한 문자를 생성: %d(%c)\n", rand, rand);
                isAsc = true;
            } else if (97<=rand && rand<=122) {
                System.out.printf("랜덤한 문자를 생성: %d(%c)\n", rand, rand);
                isAsc = true;
            } else {
                System.out.println("다시 생성!");
            }
        }
    }
}
