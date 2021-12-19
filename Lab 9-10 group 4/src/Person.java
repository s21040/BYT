
abstract class Person {
    String login;
    String password;

    public Person(String login, String password) {
        this.login = login;
        this.password = password;

    }
    public abstract void signUp();
    public abstract  void logIn();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
