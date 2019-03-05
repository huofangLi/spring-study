package com.spring;

public class MessageServiceImpl implements MessageService {
    private String username;
    private int age;

    public MessageServiceImpl(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public MessageServiceImpl() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MessageServiceImpl{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String getMessage() {
        return "Hello World!" + username + ",age is" + age;
    }
}
