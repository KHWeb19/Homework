
import java.util.Scanner;

public class Cat {

    public static final int catNum = 3;

    public Scanner scan;
    // public static String name;
    // 이름을 넣어서 표현하려고하는데
    //  System.out.println("고양이 이름 : ");
    //  name = scan.next();
    //  cat_Account[0] =   Integer.parseInt(name);
    // 이렇게했더니 에러가나서.. 무슨문제인걸까요??

    public static int age;
    public static int weight;

    public static int[] cat_Account;

    public void initMyCat(){
        cat_Account = new int[catNum];
        scan = new Scanner(System.in);

        initcat_Account();
    }

    public void initcat_Account() {
        putCat_name();
      //  System.out.println("고양이 이름 = " + cat_Account[0]);


        System.out.printf("고양이 나이 = %d 고양이 무게 = %d\n",
                cat_Account[0], cat_Account[1]);
    }

    public void putCat_name() {
      //  System.out.println("고양이 이름 : ");
      //  name = scan.next();
      //  cat_Account[0] =   Integer.parseInt(name);


        System.out.print("고양이 나이 : ");
        age = scan.nextInt();
        cat_Account[0] = age;

        System.out.print("고양이 무게 : ");
        weight = scan.nextInt();
        cat_Account[1] = weight;
    }

}

