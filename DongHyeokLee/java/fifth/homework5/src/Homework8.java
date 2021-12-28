public class Homework8 {
    public static void main(String[] args) {
        /*2명이 주사위 게임을 한다. (배열 활용) ->
        주사위는 각자 2개씩 굴릴 수 있다.-> 두개씩 인가 두번인가 -> 두번으로갑시당
        처음 주사위를 굴렸을때 결과가 짝수라면 한 번 더 돌릴 수 있다.
        (2, 4, 6, 8, 10, 12)
        한 번 더 돌리는 주사위는 특수 스킬을 가지고 있다.
        (특수 스킬 주사위는 1번만 굴린다) -> 한개만 돌린다는건가
        이 특수 스킬들은 1, 3, 4, 6에서 동작한다.
        1번의 경우 상대방의 주사위 눈금을 2 떨군다.
        3번의 경우 다 같이 -6을 적용한다. (결과는 0 이하로 떨어지지 않는다 - 무승부 노리기)
        4번의 경우 그냥 패배 처리한다.
        6번의 경우 모든 상대방에게 3을 뺏어서 내거에 3을 더한다.
        2번, 5번은 그냥 특수 스킬이 동작하지 않고 단순히 더해진다.*/

        //2명 (배열을 어디활용하지  주사위 숫자에?)
        // 2개씩 주사위 굴림 주사위 하나 1~6 두개 1~6 값을 더한다
        // 더해서 짝수면 한번더 돌린다 짝수가아니면 상대방차례
        // 1 ,3 ,4 ,6일경우 스킬발동
        // 상대방 던질 차례


        //일단 배열 생각말고 되는대로 해보기
        //주사위에 배열 할당하고 그 주사위에서 특수스킬 발동하게하는건가?
        //배열을 어디에 할당할지 감이 안잡힘


     /* 도무지 정리가 안돼서 포기 ㅠㅠ
        int[] people = new int[2];
        int num = 0;

        people[0] = 0;
        people[1] = 0;

        while(true){
            if(num == 0){

            int dice1 = (int)(Math.random()*5+1);
            int dice2 = (int)(Math.random()*5+1);
            int sum = dice1 + dice2;

            people[num] += sum;

                System.out.println("0님의 현재 위치 " + sum);


            if(sum % 2 == 0){
                System.out.println("특수주사위를 던지시오");
                int special = (int)(Math.random()*5+1);

                if(special == 1){
                    people[num+1] -= 2;
                    System.out.println("상대방은 뒤로 두칸가시오");
                    System.out.println("1님의 현재 위치 = " + people[num+1]);
                }
                if(special == 3){
                    people[num] -= 6;
                    people[num+1] -= 6;
                    System.out.println("모두 뒤로 여섯칸 가시오");
                    System.out.println("1님의 현재 위치 = " + people[num+1]);
                }
                if(special == 4){
                   System.out.println("0님의 패배입니다");      //if 문 여러개일때 이렇겐가...
                   break;
               }
                if(special == 6){
                   people[num+1] -= 3;
                   people[num] += 3;
                    System.out.println("상대방은 뒤로 세칸 본인은 앞으로 세칸가시오");
                    System.out.println("0님의 현재 위치 = " + people[num-1]);
               }
                if(special == 2 || special ==5){
                   people[num] += special;                 //이게 아닌거 같아 ~
                    System.out.println(special +"숫자만큼 전진하시오");
                }
                System.out.println("상대방이 던질 차례입니다.");
            }
                System.out.println(num +"님의 현재 위치 = "+ people[num]);

            num = 1;

            }if(num == 1){

                int dice1 = (int)(Math.random()*5+1);
                int dice2 = (int)(Math.random()*5+1);
                int sum = dice1 + dice2;

                people[num] += sum;


                if(sum % 2 == 0){
                    int special = (int)(Math.random()*5+1);

                    if(special == 1){
                        people[num-1] -= 2;
                        System.out.println("상대방은 뒤로 두칸가시오");
                        System.out.println("0님의 현재 위치 = " + people[num-1]);
                    }
                    if(special == 3){
                        people[num] -= 6;
                        people[num-1] -= 6;
                        System.out.println("모두 뒤로 여섯칸 가시오");
                        System.out.println("0님의 현재 위치 = " + people[num-1]);
                    }
                    if(special == 4){
                        System.out.println("1님의 패배입니다");
                        break;
                    }
                    if(special == 6){
                        people[num-1] -= 3;
                        people[num] += 3;
                        System.out.println("상대방은 뒤로 세칸 본인은 앞으로 세칸가시오");
                        System.out.println("0님의 현재 위치 = " + people[num-1]);
                    }
                    if(special == 2 || special ==5){
                        people[num] += special;                 //이게 아닌거 같아 ~
                        System.out.println("나온 숫자만큼 전진하시오");
                    }
                    System.out.println(num +"님의 현재 위치 = "+ sum);
                }

                num = 0;
             }
            }
        }
    }

      */










