public class Six {
    public static void main(String[] args) {


        //(Math.random() * (최대값-최소값-1) + 최소값
        //65~122까지의 난수
        int c = (int)(Math.random() * 58 +65);

        //c의 난수 값 출력
        System.out.println("65~122까지의 난수는 : " + c);

        //c는 65보다 크거나 같아야하며 90보다는 작거나 같아야 한다
        //혹은 c는 97보다 크거나 같아야 하며 122보다는 작거나 같아야 한다
        if((c>=65 && c<=90) || (c>=97 && c<=122)){
            //위 공식에 부합이 되면 참 임으로 바로출력
            System.out.println("65~90혹은 97~122 해당 : " + c);
        }else
            //위 공식에 부합하지 않으면 거짓으로 해당하지 않음 출력
            System.out.println("해당하지 않음");
    }
}
