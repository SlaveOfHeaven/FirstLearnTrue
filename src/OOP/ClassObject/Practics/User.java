package OOP.ClassObject.Practics;

public class User {
    private String Login;
    private int Password;

    public String getLogin() {
        return Login;
    }

    public int getPassword() {
        return Password;
    }

    public User(String login, int password) {
        Login = login;
        Password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj instanceof User anotherUser){
            return this.getLogin().equals(anotherUser.getLogin()) && this.getPassword()==(anotherUser.getPassword());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.Login.hashCode();
    }
}
