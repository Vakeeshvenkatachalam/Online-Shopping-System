public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String uname, String pwd) {
        return this.username.equals(uname) && this.password.equals(pwd);
    }
}