import java.util.ArrayList;

public class ArrayListPractice {

        ArrayList<Integer> member = new java.util.ArrayList<>();

        Dice ranDice = new Dice();

        public ArrayListPractice(){




        }

        public void array(){
            member.add(2);
            member.add(1);
            System.out.println(member);
            System.out.println(member.get(0));
            System.out.println(member.size());
            member.remove(0);
            System.out.println(member);
        }





    public Object getQuestion(){
            return ranDice;
    }


}
