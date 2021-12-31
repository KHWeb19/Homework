public class Date6thAns3Class {
    public static void main(String[] args) {
        Date6thAns3 d3 = new Date6thAns3();

        System.out.println("리텀값 : " +d3.random());
        d3.randomArry();
        d3.playRandom();

        for (int i = 0; i < Date6thAns3.maxNum; i++) {
            if(d3.random()==Date6thAns3.selectedLotto[i]){
                System.out.println("당첨!");
                break;
            }else {
                System.out.println("꽝!");
                continue;
            }
        }

    }
}
