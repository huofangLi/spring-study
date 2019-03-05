package com.spring.IoC;

import java.util.List;

public class Boss {
    private String name;
    private String commany;
    private Car car;
    private List<String> hobby;

    public Boss() {
    }

    public Boss(String name, String commany, Car car, List<String> hobby) {
        this.name = name;
        this.commany = commany;
        this.car = car;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", commany='" + commany + '\'' +
                ", car=" + car +
                ", hobby=" + hobby +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommany() {
        return commany;
    }

    public void setCommany(String commany) {
        this.commany = commany;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
}
