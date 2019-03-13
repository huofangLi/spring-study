package com.spring.orm.UserLogin;

public class UserLogin {
    private User user;

    public UserLogin(User user) {
        this.user = user;
    }

    public UserLogin() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLogin(User user) {
        if (user.getUser().equals("admin") && user.getPassword().equals("123")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "user=" + user +
                '}';
    }
}
