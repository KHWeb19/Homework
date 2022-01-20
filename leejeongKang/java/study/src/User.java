public class User {
    private String userId;
    private String userPwd;
    private String userName;
    private String address;
    private String phone;
    private char gender;

    public User (){
        this("USER1","qwerty","Lee","Busan","010456789123",'m');
    }

    public User (String userId, String userPwd){
        this(userId,userPwd,"Kim","Seoul","010123456789",'f');
    }

    public User (String userId, String userPwd, String userName, String address, String phone, char gender){
        setUserId(userId);
        setUserPwd(userPwd);
        setUserName(userName);
        setAddress(address);
        setPhone(phone);
        setGender(gender);
    }
    public void setUserId(String userId){this.userId = userId;}
    public void setUserPwd(String userPwd){this.userPwd = userPwd;}
    public void setUserName(String userName){this.userName = userName;}
    public void setAddress(String address) {this.address = address;}
    public void setPhone(String phone){this.phone = phone;}
    public void setGender (char gender){this.gender  = gender;}


    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                '}';
    }
}
