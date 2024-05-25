package Singleton;

public class UserRegister {
    private int userID;
    private String userName;
    private String userLastName;
    private static UserRegister instance;

    private UserRegister(int userID, String userName, String userLastName) {
        this.userID = userID;
        this.userName = userName;
        this.userLastName = userLastName;
    }

    public static UserRegister getInstance(){
        if (instance == null){
            instance = new UserRegister(1,"Karina", "Guzman");
        }
        return instance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void addUSer(String userName, String userLastName){
        return;
    }
}
