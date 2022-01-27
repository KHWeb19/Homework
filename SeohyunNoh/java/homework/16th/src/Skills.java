public interface Skills {
    /*
    4. Interface생성
       여기서 각 스킬들의 기능을 넣어주면 될 거 같음
       shield --> attack받은 것을 0으로 바꿔줌 (ex. -5라는 attack을 받으면 0으로 만들어줌)
       attack --> 상대방 hp에서 -5 빼주기
     */

    public void shield();
    public void attack();
}
