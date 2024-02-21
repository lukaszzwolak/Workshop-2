package pl.coderslab.utils.entity;

public class User {
    private int id;
    private String userName;
    private String email;
    private String password;

    public User(String userName, String email, String unhashedPassword) {
        this.setUserName(userName);
        this.setEmail(email);
        this.setPassword(unhashedPassword);
    }

    public User(int userId, String userName, String email, String password) {
        this(userName, email, password);
        this.setId(userId);
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}