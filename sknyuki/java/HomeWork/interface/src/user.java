import java.util.Scanner;

public class user {
    private final String name;
    private String job;
    private int LV;
    boolean huntaction;
    Scanner scan=new Scanner(System.in);
    //몬스터를 죽이면 레벨이 오르고 레벨 sum값이 30에 오르면 직업을 선택할수 있게끔

    public user(String name,int LV,String job){
        this.name=name;
        this.LV=LV;

    }
    public boolean huntaction(){
        LV=0;
        huntaction=true;

            System.out.println("사냥하시겠습니까?");

           String YorN = scan.nextLine();
            if(YorN.equals("Y")) {
                LV += 1;
                System.out.printf("LV이 올랐습니다. 현재 레벨은 %d입니다.", LV);

            }else if(YorN.equals("N")) {
                System.out.printf(" 현재 레벨은 %d입니다.", LV);

            }else{
                System.out.println("다시입력하시오");

            }
        return huntaction;
        }

        public ebolution(){
            if(LV<10){

            }
        }


    }

