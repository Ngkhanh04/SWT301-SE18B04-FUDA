public class UserAccount {
    private String user;
    private String pass;

    // Constructor
    public UserAccount(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    // Getter and Setter methods
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    // Method to validate credentials
    public boolean validateCredentials(String inputUser, String inputPass) {
        return this.user.equals(inputUser) && this.pass.equals(inputPass);
    }
}
