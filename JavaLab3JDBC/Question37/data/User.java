package JavaLab3JDBC.Question37.data;

public class User {
    public String userName;
    public String password;

    public User(){}
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
     }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
