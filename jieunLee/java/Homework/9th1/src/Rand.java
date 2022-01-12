public class Rand {
    public int initRand(int min, int max) {
        return (int)(Math.random()*(max-min+1)+min);
    }
    public void daesoRand() {
        int rand = initRand(65, 122);
        if (65<=rand && rand<=90) {
            System.out.printf("랜덤 숫자의 아스키코드 %d(%c)\n", rand, rand);
        } else if (97<=rand && rand<=122) {
            System.out.printf("랜덤 숫자의 아스키코드 %d(%c)\n", rand, rand);
        } else {
            System.out.printf("랜덤 숫자의 아스키코드 %d(해당사항없음)\n", rand);
        }
    }
}
