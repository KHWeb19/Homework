public class User {
    String userID, userPwd, userName, address, phone;
    char gender;

    public void initUser(String userID, String userPwd){
        System.out.println("회원정보 오버로딩 1");
        System.out.println("ID: "+ userID + "Pwd: " + userPwd);
    }

    public void initUser(String userID, String userPwd, String userName, String address, String phone, char gender){
        System.out.println("회원정보 오버로딩 2");
        System.out.printf("ID: %s /Pwd: %s /Name: %s /Address: %s /Phone: %s /Gender: %s",
                userID, userPwd, userName, address, phone, gender);
    }

    public String printUser1(){
        return userID + userPwd;
    }

    public String printUser2(){
        return userID + userPwd + userName + address + phone + gender;
    }

}
