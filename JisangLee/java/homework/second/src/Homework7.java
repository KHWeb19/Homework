public class Homework7 {
    //주사위 홀수 = 손모가지
    public static void main(String[] args) {
        double rand = Math.random();
        int dice = (int) (Math.random() * 6 + 1);
        if (dice % 2 != 0)
        {
            System.out.println("주사위 = " + dice );
            System.out.println("손모가지를 내놔라");
        }
        else{
            System.out.println("손모가지를 살렸습니다");
        }
    }
}

